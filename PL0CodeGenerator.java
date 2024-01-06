package PL_0;

import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class PL0CodeGenerator extends PL_0BaseVisitor<String> {

    private Map<String, Pair<String, Integer>> idTable = new HashMap<>();
    private int tempVarCount = 0;

    // 访问程序节点
    @Override
    public String visitProgram(PL_0Parser.ProgramContext ctx) {
        visitChildren(ctx); // 访问子节点
        return null;
    }

    // 访问常量声明节点
    @Override
    public String visitConstDeclaration(PL_0Parser.ConstDeclarationContext ctx) {
        for (PL_0Parser.ConstDefinitionContext constDefCtx : ctx.constDefinition()) {
            String name = constDefCtx.IDENTIFIER().getText();

            // 检查是否已经定义了具有相同名称的标识符。
            if (idTable.containsKey(name)) {
                System.err.println("Identifier " + name + " is already defined.");
                return "Identifier " + name + " is already defined";
            }

            // 由于我们不存储常量的值，这里不需要转换和存储值
            // 将标识符添加到符号表中，类型为"Const"
            // 获取常量的值
            int value = Integer.parseInt(constDefCtx.INTEGER().getText());

            // 将标识符及其值添加到符号表中，类型为"Const"
            idTable.put(name, new Pair<>("Const", value));
        }
        // 所有常量定义都处理完毕，没有错误发生
        return null;
    }

    public void printSymbolTable() {
        System.out.println("Symbol Table:");
        System.out.println("-------------");
        System.out.println("Name\tType\tValue");
        for (Map.Entry<String, Pair<String, Integer>> entry : idTable.entrySet()) {
            String name = entry.getKey();
            Pair<String, Integer> typeValuePair = entry.getValue();
            String type = typeValuePair.a;
            Integer value = typeValuePair.b;
            System.out.println(name + "\t" + type + "\t" + value);
        }
        System.out.println("-------------");
    }

    // 访问变量声明节点
    @Override
    public String visitVarDeclaration(PL_0Parser.VarDeclarationContext ctx) {
        for (var idCtx : ctx.IDENTIFIER()) {
            String name = idCtx.getText();

            // 检查是否已经定义了具有相同名称的标识符。
            if (idTable.containsKey(name)) {
                System.err.println("Identifier " + name + " is already defined.");
                return "Identifier " + name + " is already defined";
            }

            // 将标识符及其值添加到符号表中，类型为"Var"
            idTable.put(name, new Pair<>("Var", Integer.MAX_VALUE));
        }
        // 所有变量声明都处理完毕，没有错误发生
        return null;
    }


    // 访问赋值语句节点
    @Override
    public String visitAssignmentStatement(PL_0Parser.AssignmentStatementContext ctx) {
        String leftSide = ctx.IDENTIFIER().getText(); // 获取左侧变量名
        // 检查idTable中是否存在leftSide变量
        if (!idTable.containsKey(leftSide)) {
            // 如果变量不存在，可能需要抛出一个错误或者进行一些错误处理
            throw new RuntimeException("Undeclared variable " + leftSide);
        }else if(idTable.get(leftSide).equals("Const")){
            throw new RuntimeException("不能给常量赋值");
        }
        String rightSide = visit(ctx.expression()); // 获取右侧表达式的四元式表示

        // 四元式通常包含 (运算符, 参数1, 参数2, 结果)
        // 对于赋值语句，运算符是 ':='，参数1 是右侧表达式的结果，参数2 是空，结果是左侧变量
        // String tac = "(:=, " + rightSide + ", _, " + leftSide + ")";

        // 打印四元式
        emit(":=",rightSide,"_",leftSide);
        return null; // 返回四元式的字符串表示，以便可以被调用者使用
    }

    private String newTempVar() {
        return "t" + tempVarCount++;
    }

    @Override
    public String visitExpression(PL_0Parser.ExpressionContext ctx) {
        String result = visitTerm(ctx.term(0)); // 访问第一个项

        // 对每个额外的项生成四元式
        for (int i = 1; i < ctx.term().size(); i++) {
            // 获取前面紧邻的操作符
            String operator = ctx.getChild((i - 1) * 2 + 1).getText();

            String rightSide = visitTerm(ctx.term(i)); // 访问下一个项

            // 创建新的临时变量来存储中间结果
            String tempVar = newTempVar();

            // 输出四元式格式为 (运算符, 操作数1, 操作数2, 结果)
            emit(operator, result, rightSide, tempVar);

            // 更新结果为临时变量
            result = tempVar;
        }

        return result;
    }




    @Override
    public String visitTerm(PL_0Parser.TermContext ctx) {
        String result = visitFactor(ctx.factor(0)); // 访问第一个因子
        for (int i = 1; i < ctx.factor().size(); i++) {
            // 确定运算符是乘法还是除法
            String operator = ctx.STAR().size() > i - 1 ? "*" : "/";
            String rightSide = visitFactor(ctx.factor(i)); // 访问下一个因子
            String tempVar = newTempVar(); // 创建新的临时变量

            // 输出四元式格式为 (运算符, 操作数1, 操作数2, 结果)
            // System.out.println("(" + operator + ", " + result + ", " + rightSide + ", " + tempVar + ")");
            emit(operator, result, rightSide, tempVar);
            result = tempVar; // 更新结果为临时变量
        }
        return result;
    }


    @Override
    public String visitFactor(PL_0Parser.FactorContext ctx) {
        // 因子是一个标识符
        if (ctx.IDENTIFIER() != null){
            String identifier = ctx.IDENTIFIER().getText();

            // 检查idTable中是否存在该标识符
            if (!idTable.containsKey(identifier)) {
                // 如果变量未声明，则抛出异常或进行错误处理
                throw new RuntimeException("Undeclared variable: " + identifier);
            }
            return identifier;
        } else if (ctx.INTEGER() != null) {
            // 因子是一个整数
            return ctx.INTEGER().getText();
        } else if (ctx.expression() != null) {
            // 因子是一个括号内的子表达式
            return visitExpression(ctx.expression());
        }
        // 如果语法规则中还有其他情况，则需要相应地处理
        return null;
    }


    @Override
    public String visitBlock(PL_0Parser.BlockContext ctx) {
        visitChildren(ctx);
        return null;
    }

    public String visitCondition(PL_0Parser.ConditionContext ctx) {
        // 访问并获取第一个表达式的四元式表示
        String leftExpression = visit(ctx.expression(0));

        // 获取比较运算符
        String operator;
        if (ctx.EQUAL() != null) {
            operator = "eq";
        } else if (ctx.NOT_EQUAL() != null) {
            operator = "ne";
        } else if (ctx.LT() != null) {
            operator = "lt";
        } else if (ctx.LE() != null) {
            operator = "le";
        } else if (ctx.GT() != null) {
            operator = "gt";
        } else if (ctx.GE() != null) {
            operator = "ge";
        } else {
            throw new RuntimeException("Unknown comparison operator in condition.");
        }

        // 访问并获取第二个表达式的四元式表示
        String rightExpression = visit(ctx.expression(1));

        // 创建一个新的临时变量来存储条件的结果,
        // String tempVar = newTempVar();


        // 返回一个包含操作符、左操作数和右操作数的字符串，格式为"op,arg1,arg2"
        return operator + "," + leftExpression + "," + rightExpression;
    }



    private int quadLabel = 100; // 四元式的起始标签

    // 假设有一个ArrayList来存储所有生成的四元式
    ArrayList<String[]> quads = new ArrayList<>();

    // 生成四元式并返回其在列表中的索引
    public int emit(String op, String arg1, String arg2, String result) {
        String[] quad = {op, arg1, arg2, result};
        quadLabel++;
        quads.add(quad);
        return quadLabel - 1; // 返回新生成的四元式的索引
    }
    // 假设这个方法是类的一部分，且quads是类的成员变量
    public void printQuads() {
        for (int i = 100; i < 100 + quads.size(); i++) {
            String[] quad = quads.get(i-100);
            System.out.println( i + " (" + quad[0] + ", " + quad[1] + ", " + quad[2] + ", " + quad[3] + ")");
        }
    }

    // 替换指定索引位置的四元式中的占位符为实际的跳转标签
    public void replace(int toRefillIndex, int targetLabel) {
        // 获取需要替换占位符的四元式
        String[] quad = quads.get(toRefillIndex - 100);
        // 替换占位符为实际的跳转标签
        quad[3] = String.valueOf(targetLabel);
        // 更新列表中的四元式
        quads.set(toRefillIndex -100, quad);
    }


    public String visitLoopStatement(PL_0Parser.LoopStatementContext ctx) {
        // 循环开始前设置一个标签
        int loopStartLabel = quadLabel;

        // 生成条件表达式的四元式
        String conditionResult = visitCondition(ctx.condition());
        String op = conditionResult.split(",")[0];
        String arg1 = conditionResult.split(",")[1];
        String arg2 = conditionResult.split(",")[2];

        // 条件判断跳转，位置待填充
        int labelTrue = quadLabel + 2; // 条件为真时执行的代码块的开始位置标签
        int toRefill1 = emit("j" + op, arg1, arg2, String.valueOf(labelTrue)); // 使用0作为占位符
        int toRefill2 = emit("j","_","_","0");
        // 循环体内的语句
        visit(ctx.statement());

        // 循环结束后跳回到循环开始处
        emit("j", "_", "_", Integer.toString(loopStartLabel));

        // 循环体外跳转的标签
        int loopEndLabel = quadLabel;

        // 回填条件判断跳转的目标地址（跳出循环的地址）
        replace(toRefill2, loopEndLabel);

        return null;
    }


    @Override
    public String visitConditionStatement(PL_0Parser.ConditionStatementContext ctx) {
        // 生成条件表达式的四元式
        String conditionResult = visitCondition(ctx.condition());
        String op = conditionResult.split(",")[0]; // 假设visitCondition返回的结果是"op,arg1,arg2"
        String arg1 = conditionResult.split(",")[1];
        String arg2 = conditionResult.split(",")[2];

        // 条件判断跳转，真实的跳转目标地址将在后面生成的四元式中立即填入
        int labelTrue = quadLabel + 2; // 条件为真时执行的代码块的开始位置标签
        emit("j" + op, arg1, arg2, Integer.toString(labelTrue));

        // 条件为假时跳转到语句块之外，目标地址暂时未知
        int toRefillEndIndex = emit("j", "_", "_", "0"); // 0 暂时作为占位符

        // 访问并生成条件为真时需要执行的语句的四元式
        visit(ctx.statement());


        // 回填条件为假时跳转到语句块之外的目标地址
        int labelEnd = quadLabel; // 条件为假时应该跳转到的位置
        replace(toRefillEndIndex, labelEnd);

        // 输出条件语句结束后的标签（此处不再需要输出，因为这是编译阶段）
        // System.out.println(labelEnd + ":");

        // 条件语句不返回任何值
        return null;
    }


}


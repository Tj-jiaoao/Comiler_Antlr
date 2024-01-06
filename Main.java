package PL_0;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    private static String readFileAsString(String filePath) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static void main(String[] args) {
        // 这里是您的PL/0代码字符串
        String pl0Code = readFileAsString("./program.txt");
        try {
            // 从字符串创建字符流
            CharStream charStream = CharStreams.fromString(pl0Code);

            // 创建词法分析器
            PL_0Lexer lexer = new PL_0Lexer(charStream);

            // 从词法分析器获取Token流
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // 创建语法分析器
            PL_0Parser parser = new PL_0Parser(tokens);

            // 开始解析程序入口点
            ParseTree tree = parser.program();

            // 创建中间代码生成器访问者
            PL0CodeGenerator codeGenerator = new PL0CodeGenerator();

            // 访问解析树以生成三地址代码
            codeGenerator.visit(tree);

            codeGenerator.printQuads();

            codeGenerator.printSymbolTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

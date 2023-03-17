package com.atguigu.interpreter;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Client {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        HashMap<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果： " + expStr + "=" + calculator.run(var));

        System.out.println("--------------------------------");

        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("10 * (2 + 1)");
        int result = (Integer) expression.getValue();
        System.out.println(result);
    }

    public static String getExpStr() throws IOException {
        System.out.println("请输入表达式: ");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    public static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();

        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                if (!map.containsKey(String.valueOf(ch))) {
                    map.put(String.valueOf(ch), getVal(ch));
                }
            }
        }
        return map;
    }


    public static Integer getVal(char ch) throws IOException {
        System.out.println("请输入" + ch + "的值： ");
        String val = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        return Integer.parseInt(val);
    }
}

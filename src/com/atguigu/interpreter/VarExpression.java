package com.atguigu.interpreter;

import java.util.HashMap;

public class VarExpression extends Expression{
    String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}

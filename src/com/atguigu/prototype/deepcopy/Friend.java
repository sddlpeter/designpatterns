package com.atguigu.prototype.deepcopy;

public class Friend implements Cloneable {
    String name;
    int age;
    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

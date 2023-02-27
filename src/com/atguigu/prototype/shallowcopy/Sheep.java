package com.atguigu.prototype.shallowcopy;

import jdk.jshell.JShell;

public class Sheep implements Cloneable{
    String name;
    int age;
    String color;
    Sheep friend;
    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep deep = (Sheep) super.clone();
        System.out.println(friend.name);
        deep.friend = (Sheep) friend.clone();
        return deep;
    }
}

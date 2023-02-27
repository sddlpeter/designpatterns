package com.atguigu.prototype.shallowcopy;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("Tom", 1, "white");
        sheep.friend = new Sheep("Jerry", 2, "grey");
        Sheep sheep1 = (Sheep) sheep.clone();
        System.out.println(sheep1.friend);
        System.out.println(sheep.friend);
    }
}

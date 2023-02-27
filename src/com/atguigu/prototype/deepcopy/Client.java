package com.atguigu.prototype.deepcopy;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p = new Person("Tom", 22);
        p.friend = new Friend("Jerry", 20);

        Person p1 = (Person) p.deepClone();
        System.out.println(p.friend);
        System.out.println(p1.friend);
    }
}

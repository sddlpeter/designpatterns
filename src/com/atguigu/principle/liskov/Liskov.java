package com.atguigu.principle.liskov;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.func1(2, 5));
        B b = new B();
        System.out.println(b.func1(2, 5));
        System.out.println(b.func2(2, 5));
    }
}

class A {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}


class B extends A {
    public int func1(int a, int b) {
        return a + b;
    }
    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}
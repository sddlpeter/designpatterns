package com.atguigu.principle.liskov.improve;

public class Liskov {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.func1(2, 7));
        System.out.println(b.func2(2, 7));
        System.out.println(b.func3(2, 7));
    }
}

class Base{

}

class A extends Base {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}


class B extends Base {
    private A a = new A();
    public int func1(int a, int b) {
        return a + b;
    }
    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }
}
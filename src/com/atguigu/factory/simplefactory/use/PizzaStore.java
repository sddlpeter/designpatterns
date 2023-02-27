package com.atguigu.factory.simplefactory.use;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());
    }
}

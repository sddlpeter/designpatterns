package com.atguigu.factory.simplefactory.pizza;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(pizzaName + " 正在准备...");;
    }
}

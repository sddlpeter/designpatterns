package com.atguigu.factory.simplefactory.use;

import com.atguigu.factory.simplefactory.pizza.CheesePizza;
import com.atguigu.factory.simplefactory.pizza.GreekPizza;
import com.atguigu.factory.simplefactory.pizza.PepperPizza;
import com.atguigu.factory.simplefactory.pizza.Pizza;

public class SimpleFactory {


    public Pizza createPizza(String orderType) {
        System.out.println("使用简单工厂模式...");

        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setPizzaName("奶酪披萨");
        } else if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setPizzaName("希腊披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setPizzaName("胡椒披萨");
        }
        return pizza;
    }

}

package com.atguigu.factory.simplefactory.pizza;

public abstract class Pizza {
    public String pizzaName;
    public abstract void prepare();
    public void bake() {
        System.out.println(pizzaName + " 正在烘烤... ");
    }
    public void cut() {
        System.out.println(pizzaName + " 正在分片...");
    }

    public void box() {
        System.out.println(pizzaName + " 正砸装盒...");
    }

    public void setPizzaName(String name) {
        this.pizzaName = name;
    }

}

package com.atguigu.decorator;

public class Decorator extends Drink{
    private Drink obj;
    public Decorator(Drink drink) {
        this.obj = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + " " + super.getPrice() + "  && " + obj.getDes();
    }
}

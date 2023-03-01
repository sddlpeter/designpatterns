package com.atguigu.decorator;

public class CoffeeBar {
    public static void main(String[] args) {


        Drink drink = new Espresso();
        System.out.println("费用：" + drink.cost() + " " + drink.getDes());

        // add milk
        drink = new Milk(drink);
        System.out.println("费用：" + drink.cost() + " " + drink.getDes());

        // add chocolate
        drink = new Chocolate(drink);
        System.out.println("费用：" + drink.cost() + " " + drink.getDes());

        // add one more chocolate
        drink = new Chocolate(drink);
        System.out.println("费用：" + drink.cost() + " " + drink.getDes());

    }
}

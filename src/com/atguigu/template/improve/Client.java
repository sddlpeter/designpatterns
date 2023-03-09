package com.atguigu.template.improve;

public class Client {
    public static void main(String[] args) {
        System.out.println("------ 红豆豆浆 --------");
        RedBeanSoyMilk redBeanSoyMilk = new RedBeanSoyMilk();
        redBeanSoyMilk.make();

        System.out.println("------ 花生豆浆 --------");
        PeanutSoyMilk peanutSoyMilk = new PeanutSoyMilk();
        peanutSoyMilk.make();


        System.out.println("------ 纯豆浆 --------");
        PureSoyMilk pureSoyMilk = new PureSoyMilk();
        pureSoyMilk.make();
    }
}

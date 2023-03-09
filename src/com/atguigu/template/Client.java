package com.atguigu.template;

import org.springframework.context.ConfigurableApplicationContext;

public class Client {
    public static void main(String[] args) {
        System.out.println("------ 红豆豆浆 --------");
        RedBeanSoyMilk redBeanSoyMilk = new RedBeanSoyMilk();
        redBeanSoyMilk.make();

        System.out.println("------ 花生豆浆 --------");
        PeanutSoyMilk peanutSoyMilk = new PeanutSoyMilk();
        peanutSoyMilk.make();

        ConfigurableApplicationContext context;
    }
}

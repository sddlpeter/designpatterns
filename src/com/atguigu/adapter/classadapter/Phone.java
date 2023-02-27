package com.atguigu.adapter.classadapter;

public class Phone {
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压是5V，可以充电");
        } else {
            System.out.println("电压过高，无法充电");
        }
    }
}

package com.atguigu.adapter.objectadapter;

public class Phone {
    public void charging(VoltageAdapter voltageAdapter) {
        if (voltageAdapter.output5V() == 5) {
            System.out.println("电压是5V，可以充电");
        } else {
            System.out.println("电压大于5V，不能充电");
        }
    }
}

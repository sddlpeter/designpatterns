package com.atguigu.adapter.objectadapter;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Voltage220V voltage220V = new Voltage220V();
        VoltageAdapter voltageAdapter = new VoltageAdapter(voltage220V);
        phone.charging(voltageAdapter);
    }
}

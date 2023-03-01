package com.atguigu.bridge.org;

public class Client {
    public static void main(String[] args) {
        Brand xiaomi = new Xiaomi();
        Brand vivio = new Vivio();

        Phone phone = new UprightPhone(vivio);
        phone.open();
        phone.call();
        phone.close();
    }
}

package com.atguigu.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        AbsAdapter adapter = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("m1 method is completed.");
            }

            @Override
            public void m5() {
                System.out.println("m5 method is completed.");
            }
        };

        adapter.m1();
        adapter.m5();
    }
}

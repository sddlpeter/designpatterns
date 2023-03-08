package com.atguigu.proxy.cglib;

public class TeacherDAO {
    public void teach() {
        System.out.println("老师授课中，通过cglib代理，不需要实现接口");
    }
}

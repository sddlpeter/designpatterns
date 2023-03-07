package com.atguigu.proxy.dynamic;

public class TeacherDAO implements ITeacherDAO{
    @Override
    public void teach() {
        System.out.println("老师正在教学中...");
    }
}

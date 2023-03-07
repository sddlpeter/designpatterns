package com.atguigu.proxy.staticproxy;

public class TeacherDAOProxy implements ITeacherDAO{
    ITeacherDAO target;
    public TeacherDAOProxy(ITeacherDAO target) {
        this.target = target;
    }
    @Override
    public void teach() {
        System.out.println("代理开始...");
        target.teach();
        System.out.println("代理结束...");
    }
}

package com.atguigu.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        TeacherDAO target = new TeacherDAO();
        TeacherDAOProxy proxy = new TeacherDAOProxy(target);
        proxy.teach();
    }
}

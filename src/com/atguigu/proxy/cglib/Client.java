package com.atguigu.proxy.cglib;

public class Client {
    public static void main(String[] args) {
        TeacherDAO target = new TeacherDAO();
        TeacherDAO proxyInstance = (TeacherDAO) new ProxyFactory(target).getProxyInstance();
        proxyInstance.teach();
    }
}

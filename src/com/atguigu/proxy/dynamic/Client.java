package com.atguigu.proxy.dynamic;

import com.atguigu.proxy.dynamic.TeacherDAO;

public class Client {
    public static void main(String[] args) {
        TeacherDAO teacherDAO = new TeacherDAO();
        ProxyFactory proxyFactory = new ProxyFactory(teacherDAO);
        ITeacherDAO proxyFactoryObjectInstance = (ITeacherDAO) proxyFactory.getObjectInstance();
        proxyFactoryObjectInstance.teach();

    }
}

package com.atguigu.composite;

public class Client {
    public static void main(String[] args) {
        University university = new University("清华大学", "IT 名校");

        College CSCollege = new College("计算机学院", "");
        College ITCollege = new College("信息技术学院", "");


        university.add(CSCollege);
        university.add(ITCollege);

        CSCollege.add(new Department("软件工程", ""));
        CSCollege.add(new Department("网络工程", ""));

        ITCollege.add(new Department("计算机科学与技术", ""));
        ITCollege.add(new Department("通信工程", ""));
        ITCollege.add(new Department("信息工程", ""));

        university.print();
    }
}

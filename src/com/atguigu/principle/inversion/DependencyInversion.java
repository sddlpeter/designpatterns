package com.atguigu.principle.inversion;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Wechat());
    }
}

class Person {
    public Person() {

    }
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }

    public void receive(Wechat wechat) {
        System.out.println(wechat.getInfo());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件：Hello, world!";
    }
}

class Wechat {
    public String getInfo() {
        return "微信：这是一条微信消息...";
    }
}
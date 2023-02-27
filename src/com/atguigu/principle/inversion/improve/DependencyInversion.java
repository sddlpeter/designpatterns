package com.atguigu.principle.inversion.improve;

public class DependencyInversion {
    public static void main(String[] args) {
        Person p = new Person();
        p.receive(new Email());
        p.receive(new Wechat());
    }
}

interface IReceiver {
    public String getInfo();
}

class Person {
    public void receive(IReceiver receiver) {
        System.out.println("收到 " + receiver.getInfo());
    }
}

class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "电子邮件：Hello, world!";
    }
}

class Wechat implements IReceiver {
    public String getInfo() {
        return "微信：wechat";
    }
}
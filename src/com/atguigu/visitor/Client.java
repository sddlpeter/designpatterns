package com.atguigu.visitor;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Man());
        objectStructure.attach(new Women());

        // ------- 成功 ---------
        Action success = new Success();
        objectStructure.display(success);
        System.out.println("----------------");
        // ------- 失败 ---------
        Action fail = new Fail();
        objectStructure.display(fail);
        System.out.println("----------------");
        // ------- 待定 ---------
        Action wait = new Wait();
        objectStructure.display(wait);
    }
}

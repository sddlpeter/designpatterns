package com.atguigu.flyweight;

public class ConcreteWebsite extends Website{

    private String type = "";

    public ConcreteWebsite(String type) {
        this.type = type;
    }
    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为: " + type + "在使用中...使用者是" + user.getName());
    }
}

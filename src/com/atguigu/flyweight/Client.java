package com.atguigu.flyweight;

public class Client {
    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();
        Website website1 = factory.getWebsiteCategory("新闻");
        Website website2 = factory.getWebsiteCategory("博客");
        Website website3 = factory.getWebsiteCategory("博客");
        Website website4 = factory.getWebsiteCategory("博客");
        website1.use(new User("Tom"));
        website2.use(new User("Jack"));
        website3.use(new User("Alice"));
        website4.use(new User("Bob"));
        System.out.println(factory.getWebsiteCount());


    }
}

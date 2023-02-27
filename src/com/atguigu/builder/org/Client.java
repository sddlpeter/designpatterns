package com.atguigu.builder.org;

public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();

        HighBuilding highBuilding = new HighBuilding();
        highBuilding.build();
    }
}

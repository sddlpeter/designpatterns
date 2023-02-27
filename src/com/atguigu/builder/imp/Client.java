package com.atguigu.builder.imp;

public class Client {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new CommonHouseBuilder();
        houseBuilder = new HighBuildingBuilder();
        HouseDirector houseDirector = new HouseDirector(houseBuilder);
        houseDirector.constructHouse();
    }
}

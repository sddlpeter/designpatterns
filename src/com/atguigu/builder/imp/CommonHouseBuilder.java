package com.atguigu.builder.imp;

public class CommonHouseBuilder extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println(" 普通房子地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 普通房子砌墙20厘米");

    }

    @Override
    public void buildRoof() {
        System.out.println(" 普通房子封顶普通房顶");

    }
}

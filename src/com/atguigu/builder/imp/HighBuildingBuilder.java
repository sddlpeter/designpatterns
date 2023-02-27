package com.atguigu.builder.imp;

public class HighBuildingBuilder extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println(" 高层建筑地基20米");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 高层建筑砌墙50厘米");

    }

    @Override
    public void buildRoof() {
        System.out.println(" 高层建筑封顶透明屋顶");

    }
}

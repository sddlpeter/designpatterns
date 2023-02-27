package com.atguigu.builder.org;

public class CommonHouse extends AbstractHouse{
    @Override
    public void buildBasic() {
        System.out.println(" 普通房子建立地基");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 普通房子砌墙");

    }

    @Override
    public void buildRoofs() {
        System.out.println(" 普通房子封顶");

    }
}

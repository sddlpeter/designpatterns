package com.atguigu.builder.org;

public abstract class AbstractHouse {
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void buildRoofs();

    public void build() {
        buildBasic();
        buildWalls();
        buildRoofs();
    }
}

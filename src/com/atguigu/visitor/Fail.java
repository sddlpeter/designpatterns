package com.atguigu.visitor;

public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男生给出评价，这个歌手失败");
    }

    @Override
    public void getWomenResult(Women women) {
        System.out.println("女生给出评价，这个歌手失败");

    }
}

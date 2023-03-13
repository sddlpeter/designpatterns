package com.atguigu.visitor;

public class Wait extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男生给出评分，该歌手待定");
    }

    @Override
    public void getWomenResult(Women women) {
        System.out.println("女生给出评分，该歌手待定");
    }
}

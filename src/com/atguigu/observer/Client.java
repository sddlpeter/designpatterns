package com.atguigu.observer;

public class Client {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setData(30f, 150f, 40f);

        System.out.println("------------ 天气情况变化 -------------");

        weatherData.setData(32f, 160f, 30f);
    }
}

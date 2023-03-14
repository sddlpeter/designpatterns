package com.atguigu.observer.improve;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer currentConditions = new CurrentConditions();
        Observer baidu = new Baidu();
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baidu);

        weatherData.setData(20.0f, 100.0f, 30.3f);
    }
}

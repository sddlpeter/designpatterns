package com.atguigu.observer.improve;

public class Baidu implements Observer{
    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("baidu temperature is : " + this.temperature);
        System.out.println("baidu pressure is : " + this.pressure);
        System.out.println("baidu humidity is : " + this.humidity);
    }
}

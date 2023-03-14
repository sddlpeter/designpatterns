package com.atguigu.observer;

public class CurrentConditions {
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
        System.out.println("temperature is : " + this.temperature);
        System.out.println("pressure is : " + this.pressure);
        System.out.println("humidity is : " + this.humidity);
    }
}

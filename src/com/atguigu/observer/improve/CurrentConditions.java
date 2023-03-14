package com.atguigu.observer.improve;

public class CurrentConditions implements Observer {
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
        System.out.println("CurrentConditions temperature is : " + this.temperature);
        System.out.println("CurrentConditions pressure is : " + this.pressure);
        System.out.println("CurrentConditions humidity is : " + this.humidity);
    }
}

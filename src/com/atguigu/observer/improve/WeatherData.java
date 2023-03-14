package com.atguigu.observer.improve;

import com.atguigu.observer.CurrentConditions;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;
    List<Observer> observers;


    public WeatherData() {
        observers = new ArrayList<>();
    }


    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
        // observers.update(getTemperature(), getPressure(), getHumidity());
        notifyObservers();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperature, this.pressure, this.humidity);
        }
    }
}

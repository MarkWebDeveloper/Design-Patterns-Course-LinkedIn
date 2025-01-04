package dev.mark.java_design_patterns.observer;

import java.util.ArrayList;

public class WeatherStation implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float windSpeed;
    private float pressure;
    
    public WeatherStation(float temperature, float windSpeed, float pressure) {
        this.observers = new ArrayList<Observer>();
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, windSpeed, pressure);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
        notifyObservers();
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        notifyObservers();
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

}

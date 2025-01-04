package dev.mark.java_design_patterns.observer;

public class UserInterface implements Observer {

    private float temperature;
    private float windSpeed;
    private float pressure;
    
    @SuppressWarnings("unused")
    private Subject weatherData;

    public UserInterface(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float windSpeed, float pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Current temperature: " + temperature + "C degrees." + " Wind speed: " + windSpeed + "km/h." + " Pressure: " + pressure + "hPa.");
    }
}

package dev.mark.java_design_patterns.observer;

public class Logger implements Observer {

    private float temperature;
    private float windSpeed;
    private float pressure;
    
    @SuppressWarnings("unused")
    private Subject weatherData;

    public Logger(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float windSpeed, float pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        log();
    }

    public void log() {
        System.out.println("Logging current weather conditions: " + "Temperature: " + temperature + "C degrees." + " Wind speed: " + windSpeed + "km/h." + " Pressure: " + pressure + "hPa.");
    }
}

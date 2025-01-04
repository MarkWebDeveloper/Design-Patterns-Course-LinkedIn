package dev.mark.java_design_patterns.observer;

public class AlertSystem implements Observer {

    private float temperature;
    private float windSpeed;
    private float pressure;

    @Override
    public void update(float temperature, float windSpeed, float pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        alert();
    }

    public void alert() {
        System.out.println("Alerting current weather conditions: " + "Temperature: " + temperature + "C degrees." + " Wind speed: " + windSpeed + "km/h." + " Pressure: " + pressure + "hPa.");
    }
}

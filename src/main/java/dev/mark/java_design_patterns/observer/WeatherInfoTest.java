package dev.mark.java_design_patterns.observer;

public class WeatherInfoTest {

    static WeatherStation weatherStation = new WeatherStation(25F, 3F, 1005F);
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface(weatherStation);
        Logger logger = new Logger(weatherStation);
        AlertSystem alertSystem = new AlertSystem(weatherStation);

        weatherStation.setTemperature(30f);
        System.out.println("-------------------------------------------------");
        weatherStation.setWindSpeed(5f);
    }
}

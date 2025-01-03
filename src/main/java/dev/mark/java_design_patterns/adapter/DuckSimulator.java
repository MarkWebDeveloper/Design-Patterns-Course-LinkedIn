package dev.mark.java_design_patterns.adapter;

public class DuckSimulator {
    public static void main(String[] args) {
        SuperDrone drone = new SuperDrone();
        DroneAdapter droneAdapter = new DroneAdapter(drone);
        testDuck(droneAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}

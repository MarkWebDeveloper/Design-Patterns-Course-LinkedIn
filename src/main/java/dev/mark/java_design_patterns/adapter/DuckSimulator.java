package dev.mark.java_design_patterns.adapter;

public class DuckSimulator {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        SuperDrone drone = new SuperDrone();
        DroneAdapter droneAdapter = new DroneAdapter(drone);

        System.out.println("The Duck says...");
        System.out.println("====================================");
        duck.quack();
        duck.fly();

        System.out.println("The Drone says...");
        System.out.println("====================================");
        drone.beep();
        drone.spin_rotors();
        drone.take_off();

        System.out.println("The DroneAdapter says...");
        System.out.println("====================================");
        droneAdapter.quack();
        droneAdapter.fly();
    }
}
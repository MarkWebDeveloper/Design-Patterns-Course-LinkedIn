package dev.mark.java_design_patterns.adapter;

public class DuckSimulator {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        SuperDrone drone = new SuperDrone();
        DroneAdapter droneAdapter = new DroneAdapter(drone);

        System.out.println("The Duck says...");
        duck.quack();
        duck.fly();

        System.out.println("The Drone says...");
        drone.beep();
        drone.spin_rotors();
        drone.take_off();

        System.out.println("The DroneAdapter says...");
        droneAdapter.quack();
        droneAdapter.fly();
    }
}

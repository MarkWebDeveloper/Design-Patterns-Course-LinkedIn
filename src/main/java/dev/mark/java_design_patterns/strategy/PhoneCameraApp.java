package dev.mark.java_design_patterns.strategy;

public abstract class PhoneCameraApp {

    public void take() {
        System.out.println("The photo is taken");
    }

    public abstract void edit();

    public void save() {
        System.out.println("The photo is saved");
    }

    public void share() {
        System.out.println("The photo is shared");
    }
}

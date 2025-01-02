package dev.mark.java_design_patterns.strategy;

public abstract class PhoneCameraApp {

    ShareStrategy shareStrategy;

    public void take() {
        System.out.println("The photo is taken");
    }

    public abstract void edit();

    public void save() {
        System.out.println("The photo is saved");
    }

    public void setShareStrategy(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }

    public void share() {
        shareStrategy.share();
    }

}

package dev.mark.java_design_patterns.strategy;

public class CameraPlusApp extends PhoneCameraApp {

    public CameraPlusApp() {
        shareStrategy = new ShareByLinkedIn();
    }

    @Override
    public void edit() {
        System.out.println("Advanced editing features");
    }
    
}

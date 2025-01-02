package dev.mark.java_design_patterns.strategy;

public class BasicCameraApp extends PhoneCameraApp {

    public BasicCameraApp() {
        shareStrategy = new ShareByText();
    }

    @Override
    public void edit() {
        System.out.println("Basic editing features");
    }
    
}

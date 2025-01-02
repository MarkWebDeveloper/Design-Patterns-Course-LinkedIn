package dev.mark.java_design_patterns.strategy;

import org.springframework.boot.SpringApplication;

public class CameraAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(CameraAppApplication.class, args);
        BasicCameraApp basicCameraApp = new BasicCameraApp();
		basicCameraApp.take();
		basicCameraApp.save();
		basicCameraApp.setShareStrategy(new ShareByEmail());
		basicCameraApp.share();

		System.out.println("========================================");

		CameraPlusApp cameraPlusApp = new CameraPlusApp();
		cameraPlusApp.take();
		cameraPlusApp.edit();
		cameraPlusApp.save();
		cameraPlusApp.setShareStrategy(new ShareByLinkedIn());
		cameraPlusApp.share();
    }
}

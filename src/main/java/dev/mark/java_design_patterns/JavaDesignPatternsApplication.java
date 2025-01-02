package dev.mark.java_design_patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dev.mark.java_design_patterns.strategy.BasicCameraApp;
import dev.mark.java_design_patterns.strategy.CameraPlusApp;
import dev.mark.java_design_patterns.strategy.ShareByEmail;
import dev.mark.java_design_patterns.strategy.ShareByLinkedIn;

@SpringBootApplication
public class JavaDesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaDesignPatternsApplication.class, args);

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

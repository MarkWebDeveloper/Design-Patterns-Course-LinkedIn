package dev.mark.java_design_patterns.strategy;

public class ShareByLinkedIn implements ShareStrategy {

    @Override
    public void share() {
        System.out.println("The photo is shared by LinkedIn");
    }
    
}
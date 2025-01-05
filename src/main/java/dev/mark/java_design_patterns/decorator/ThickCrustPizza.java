package dev.mark.java_design_patterns.decorator;

public class ThickCrustPizza extends Pizza {
    public ThickCrustPizza() {
        description = "Thick Crust Pizza";
    }

    public double cost() {
        return 12.99;
    }
    
}

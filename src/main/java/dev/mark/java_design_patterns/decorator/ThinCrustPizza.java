package dev.mark.java_design_patterns.decorator;

public class ThinCrustPizza extends Pizza {
    
    public ThinCrustPizza() {
        description = "Thin Crust Pizza";
    }

    public double cost() {
        return 9.99;
    }
    
}

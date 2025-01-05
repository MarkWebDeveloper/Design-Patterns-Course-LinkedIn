package dev.mark.java_design_patterns.decorator;

public class Peppers extends ToppingsDecorator {
    Pizza pizza;
    
    public Peppers(Pizza pizza) {
        this.pizza = pizza;
    }
    
    public String getDescription() {
        return pizza.getDescription() + ", Peppers";
    }
    
    public double cost() {
        return 1.50 + pizza.cost();
    }
}
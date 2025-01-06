package dev.mark.java_design_patterns.decorator;

public class Peppers extends ToppingsDecorator {
    
    public Peppers(Pizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Peppers";
    }
    
    @Override
    public double cost() {
        return 1.50 + pizza.cost();
    }
}
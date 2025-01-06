package dev.mark.java_design_patterns.decorator;

public class Olives extends ToppingsDecorator {
    
    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }
    
    @Override
    public double cost() {
        return 2.00 + pizza.cost();
    }
}
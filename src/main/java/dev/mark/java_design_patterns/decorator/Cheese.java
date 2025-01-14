package dev.mark.java_design_patterns.decorator;

public class Cheese extends ToppingsDecorator {
    
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }
    
    @Override
    public double cost() {
        return 1.00 + pizza.cost();
    }
}

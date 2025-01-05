package dev.mark.java_design_patterns.decorator;

public class Olives extends ToppingsDecorator {
    Pizza pizza;
    
    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }
    
    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }
    
    public double cost() {
        return 2.00 + pizza.cost();
    }
}
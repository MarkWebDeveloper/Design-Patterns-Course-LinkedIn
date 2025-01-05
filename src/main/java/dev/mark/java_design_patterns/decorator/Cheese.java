package dev.mark.java_design_patterns.decorator;

public class Cheese extends ToppingsDecorator {
    Pizza pizza;
    
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }
    
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }
    
    public double cost() {
        return 1.00 + pizza.cost();
    }
}

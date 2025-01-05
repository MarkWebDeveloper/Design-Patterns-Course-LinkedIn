package dev.mark.java_design_patterns.decorator;

public abstract class ToppingsDecorator extends Pizza {
    Pizza pizza;
    public abstract String getDescription();
}

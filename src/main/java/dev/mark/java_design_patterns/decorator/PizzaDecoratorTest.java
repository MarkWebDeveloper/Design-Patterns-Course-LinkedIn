package dev.mark.java_design_patterns.decorator;

public class PizzaDecoratorTest {

    public static void main(String[] args) {
        Pizza pizza = new ThickCrustPizza();
        pizza = new Cheese(pizza);
        pizza = new Olives(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.cost());
    }

}

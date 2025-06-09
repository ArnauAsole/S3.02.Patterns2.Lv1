package builder;

import Pizzeria.Pizza;

public interface PizzaBuilder {
    void setSize();
    void setDough();
    void addToppings();
    Pizza build();
}
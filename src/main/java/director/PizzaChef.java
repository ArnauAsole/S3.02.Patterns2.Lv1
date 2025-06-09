package director;

import builder.PizzaBuilder;
import Pizzeria.Pizza;

public class PizzaChef {
    private PizzaBuilder builder;

    public void setPizzaBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza makePizza() {
        builder.setSize();
        builder.setDough();
        builder.addToppings();
        return builder.build();
    }
}

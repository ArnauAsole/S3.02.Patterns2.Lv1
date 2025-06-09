package builder;

import Pizzeria.Pizza;

import java.util.ArrayList;
import java.util.List;

public class VegetarianPizzaBuilder implements PizzaBuilder {
    private String size;
    private String dough;
    private List<String> toppings;

    public VegetarianPizzaBuilder() {
        this.toppings = new ArrayList<>();
    }

    @Override
    public void setSize() {
        this.size = "Large";
    }

    @Override
    public void setDough() {
        this.dough = "Thin";
    }

    @Override
    public void addToppings() {
        toppings.add("Tomato");
        toppings.add("Olives");
        toppings.add("Bell Pepper");
        toppings.add("Onion");
    }

    @Override
    public Pizza build() {
        return new Pizza(size, dough, toppings);
    }
}

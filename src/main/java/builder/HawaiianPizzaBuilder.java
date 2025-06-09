package builder;

import Pizzeria.Pizza;

import java.util.ArrayList;
import java.util.List;

public class HawaiianPizzaBuilder implements PizzaBuilder {
    private String size;
    private String dough;
    private List<String> toppings;

    public HawaiianPizzaBuilder() {
        this.toppings = new ArrayList<>();
    }

    @Override
    public void setSize() {
        this.size = "Medium";
    }

    @Override
    public void setDough() {
        this.dough = "Thick";
    }

    @Override
    public void addToppings() {
        toppings.add("Ham");
        toppings.add("Pineapple");
        toppings.add("Cheese");
    }

    @Override
    public Pizza build() {
        return new Pizza(size, dough, toppings);
    }
}

package Pizzeria;

import java.util.List;

public class Pizza {
    private final String size;
    private final String dough;
    private final List<String> toppings;

    public Pizza(String size, String dough, List<String> toppings) {
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public String getDough() {
        return dough;
    }

    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Pizza {\n" +
                "Size = " + size + '\n' +
                "Dough = " + dough + '\n' +
                "Toppings = " + toppings + "." +
                '\n' + '}';
    }
}

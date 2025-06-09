import builder.HawaiianPizzaBuilder;
import builder.VegetarianPizzaBuilder;
import director.PizzaChef;
import Pizzeria.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaChef chef = new PizzaChef();

        // Hawaiian Pizza
        HawaiianPizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
        chef.setPizzaBuilder(hawaiianBuilder);
        Pizza hawaiianPizza = chef.makePizza();
        System.out.println(hawaiianPizza);

        // Vegetarian Pizza
        VegetarianPizzaBuilder vegetarianBuilder = new VegetarianPizzaBuilder();
        chef.setPizzaBuilder(vegetarianBuilder);
        Pizza vegetarianPizza = chef.makePizza();
        System.out.println(vegetarianPizza);
    }
}

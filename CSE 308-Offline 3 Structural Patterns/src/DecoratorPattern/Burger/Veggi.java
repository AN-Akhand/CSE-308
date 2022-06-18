package DecoratorPattern.Burger;

import DecoratorPattern.Food;

public class Veggi extends Burger {

    @Override
    public String prepareFood() {
        return "Veggi Burger";
    }

    @Override
    public double price() {
        return 10;
    }
}

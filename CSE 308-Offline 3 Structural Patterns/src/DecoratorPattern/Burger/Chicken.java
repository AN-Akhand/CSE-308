package DecoratorPattern.Burger;

import DecoratorPattern.Food;

public class Chicken extends Burger {

    @Override
    public String prepareFood() {
        return "Chicken Burger";
    }

    @Override
    public double price() {
        return 13;
    }
}

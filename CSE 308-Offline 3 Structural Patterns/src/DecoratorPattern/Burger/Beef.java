package DecoratorPattern.Burger;

import DecoratorPattern.Food;

public class Beef extends Burger {
    @Override
    public String prepareFood() {
        return "Beef Burger";
    }

    @Override
    public double price() {
        return 15;
    }
}

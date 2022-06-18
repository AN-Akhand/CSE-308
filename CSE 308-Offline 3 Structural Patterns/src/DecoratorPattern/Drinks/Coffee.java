package DecoratorPattern.Drinks;

import DecoratorPattern.Food;

public class Coffee extends Drinks{
    public Coffee(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " with Coffee";
    }

    @Override
    public double price() {
        return super.price() + 10;
    }
}

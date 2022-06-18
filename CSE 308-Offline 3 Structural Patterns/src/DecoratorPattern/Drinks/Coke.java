package DecoratorPattern.Drinks;

import DecoratorPattern.Food;

public class Coke extends Drinks {
    public Coke(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " with Coke";
    }

    @Override
    public double price() {
        return super.price() + 7;
    }
}

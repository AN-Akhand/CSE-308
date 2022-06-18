package DecoratorPattern.Drinks;

import DecoratorPattern.Food;

public class Water extends Drinks{
    public Water(Food newFood) {
        super(newFood);
    }
    @Override
    public String prepareFood() {
        return super.prepareFood() + " with Water";
    }

    @Override
    public double price() {
        return super.price() + 5;
    }
}

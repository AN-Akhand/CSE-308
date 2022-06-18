package DecoratorPattern.Appetizer;

import DecoratorPattern.Food;

public class FrenchFries extends Appetizer{
    public FrenchFries(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " with French Fries";
    }

    @Override
    public double price() {
        return super.price() + 5;
    }
}

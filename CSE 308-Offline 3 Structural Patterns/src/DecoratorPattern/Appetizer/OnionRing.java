package DecoratorPattern.Appetizer;

import DecoratorPattern.Food;

public class OnionRing extends Appetizer{
    public OnionRing(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " with Onion Ring";
    }

    @Override
    public double price() {
        return super.price() + 7;
    }
}

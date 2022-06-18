package DecoratorPattern.Cheese;

import DecoratorPattern.Food;

public class JustCheese extends Cheese{
    public JustCheese(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " with Cheese";
    }

    @Override
    public double price() {
        return super.price() + 5;
    }
}

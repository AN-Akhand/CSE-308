package DecoratorPattern.Cheese;

import DecoratorPattern.Decorator.FoodDecorator;
import DecoratorPattern.Food;

abstract public class Cheese extends FoodDecorator {
    public Cheese(Food newFood) {
        super(newFood);
    }
}

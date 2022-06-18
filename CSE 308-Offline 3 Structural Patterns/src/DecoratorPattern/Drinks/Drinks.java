package DecoratorPattern.Drinks;

import DecoratorPattern.Decorator.FoodDecorator;
import DecoratorPattern.Food;

abstract public class Drinks extends FoodDecorator {
    public Drinks(Food newFood) {
        super(newFood);
    }
}

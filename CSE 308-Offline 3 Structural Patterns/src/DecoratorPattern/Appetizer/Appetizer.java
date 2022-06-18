package DecoratorPattern.Appetizer;

import DecoratorPattern.Decorator.FoodDecorator;
import DecoratorPattern.Food;

abstract public class Appetizer extends FoodDecorator {
    public Appetizer(Food newFood) {
        super(newFood);
    }
}

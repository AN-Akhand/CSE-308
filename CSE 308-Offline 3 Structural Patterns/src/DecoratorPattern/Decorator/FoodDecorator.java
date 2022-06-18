package DecoratorPattern.Decorator;

import DecoratorPattern.Food;

public class FoodDecorator implements Food {
    Food newFood;
    public FoodDecorator(Food newFood){
        this.newFood = newFood;
    }
    @Override
    public String prepareFood() {
        return newFood.prepareFood();
    }

    @Override
    public double price() {
        return newFood.price();
    }
}

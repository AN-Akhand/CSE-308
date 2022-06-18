package DecoratorPattern;

import DecoratorPattern.Appetizer.FrenchFries;
import DecoratorPattern.Appetizer.OnionRing;
import DecoratorPattern.Burger.Beef;
import DecoratorPattern.Burger.Veggi;
import DecoratorPattern.Cheese.JustCheese;
import DecoratorPattern.Decorator.FoodDecorator;
import DecoratorPattern.Drinks.Coffee;
import DecoratorPattern.Drinks.Coke;
import DecoratorPattern.Drinks.Water;

public class Main {
    public static void main(String[] args) {
        Food burger = new FoodDecorator(new JustCheese(new FrenchFries(new Beef())));
        System.out.println(burger.prepareFood());
        System.out.println(burger.price());
        burger = new FoodDecorator(new Water(new FrenchFries(new Veggi())));
        System.out.println(burger.prepareFood());
        System.out.println(burger.price());
        burger = new FoodDecorator(new Coke(new FrenchFries(new Veggi())));
        System.out.println(burger.prepareFood());
        System.out.println(burger.price());
        burger = new FoodDecorator(new Water(new Coffee(new OnionRing(new Veggi()))));
        System.out.println(burger.prepareFood());
        System.out.println(burger.price());
        burger = new FoodDecorator(new Beef());
        System.out.println(burger.prepareFood());
        System.out.println(burger.price());
    }
}

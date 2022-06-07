package display;

public class LEDMatrix extends DisplaySystem{
    public LEDMatrix() {
        price = 200;
    }

    @Override
    public void doDisplayThings() {
        System.out.println("Displaying in LED Matrix");
    }

    @Override
    public void showProductInfo() {
        System.out.println("LEDMatrix");
    }
}

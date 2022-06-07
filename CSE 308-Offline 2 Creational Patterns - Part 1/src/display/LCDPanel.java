package display;

public class LCDPanel extends DisplaySystem{
    public LCDPanel() {
        price = 300;
    }

    @Override
    public void doDisplayThings() {
        System.out.println("Displaying in LCD Panel");
    }

    @Override
    public void showProductInfo() {
        System.out.println("LCDPanel");
    }
}

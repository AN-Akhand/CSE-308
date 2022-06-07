package font;

public class Consolas implements Font{
    @Override
    public void showInfo() {
        System.out.println("Consolas");
    }

    @Override
    public void draw() {
        System.out.println("Using Consolas");
    }
}

package font;

public class Monaco implements Font{
    @Override
    public void showInfo() {
        System.out.println("Monaco");
    }

    @Override
    public void draw() {
        System.out.println("Using Monaco");
    }
}

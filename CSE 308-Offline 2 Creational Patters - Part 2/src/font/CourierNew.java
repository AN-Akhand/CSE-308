package font;

public class CourierNew implements Font{
    @Override
    public void showInfo() {
        System.out.println("CourierNew");
    }

    @Override
    public void draw() {
        System.out.println("Using CourierNew");
    }
}

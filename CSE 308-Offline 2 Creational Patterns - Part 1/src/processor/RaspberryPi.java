package processor;

public class RaspberryPi extends Processor {

    public RaspberryPi() {
        price = 400;
    }

    @Override
    public void process() {
        System.out.println("Processing with RaspberryPi");
    }

    @Override
    public void showProductInfo() {
        System.out.println("RaspberryPi");
    }
}

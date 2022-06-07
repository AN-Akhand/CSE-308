package processor;

public class ATMega32 extends Processor {
    public ATMega32() {

        price = 200;
    }

    @Override
    public void process() {
        System.out.println("Processing with ATMega32");
    }

    @Override
    public void showProductInfo() {
        System.out.println("ATMega32");
    }
}

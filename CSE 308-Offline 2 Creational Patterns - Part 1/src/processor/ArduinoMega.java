package processor;

public class ArduinoMega extends Processor {
    public ArduinoMega(){
        price = 300;
    }
    @Override
    public void process() {
        System.out.println("Processing with ArduinoMega");
    }

    @Override
    public void showProductInfo() {
        System.out.println("ArduinoMega");
    }
}

package displayUnit;

import display.DisplaySystem;
import part.Part;
import processor.Processor;

public class DisplayUnit extends Part {
    DisplaySystem display;
    Processor processor;

    public DisplayUnit(DisplaySystem display, Processor processor) {
        this.display = display;
        this.processor = processor;
        price = display.getPrice() + processor.getPrice();
    }

    @Override
    public void showProductInfo() {
        System.out.println("DisplayUnit");
        System.out.print("\t");
        display.showProductInfo();
        System.out.print("\t");
        processor.showProductInfo();
    }
}

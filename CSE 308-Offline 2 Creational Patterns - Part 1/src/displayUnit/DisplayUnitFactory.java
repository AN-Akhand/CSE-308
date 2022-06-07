package displayUnit;

import display.DisplaySystem;
import part.Part;
import processor.Processor;

public class DisplayUnitFactory {
    Part createDisplayUnit(DisplaySystem displaySystem, Processor processor){
        return new DisplayUnit(displaySystem, processor);
    }
}

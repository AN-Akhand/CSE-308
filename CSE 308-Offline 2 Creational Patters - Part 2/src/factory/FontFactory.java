package factory;

import font.Consolas;
import font.CourierNew;
import font.Font;
import font.Monaco;
import parser.Parser;

public class FontFactory extends AbstractFactory{
    @Override
    public Parser getParser(String parser) {
        return null;
    }

    @Override
    public Font getFont(String font) {
        if(font.equalsIgnoreCase("c"))
            return new CourierNew();
        else if(font.equalsIgnoreCase("cpp"))
            return new Monaco();
        else if(font.equalsIgnoreCase("py"))
            return new Consolas();
        else
            return null;
    }
}

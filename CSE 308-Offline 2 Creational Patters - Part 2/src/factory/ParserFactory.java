package factory;

import font.Font;
import parser.CPPParser;
import parser.CParser;
import parser.Parser;
import parser.PythonParser;

public class ParserFactory extends AbstractFactory{

    @Override
    public Parser getParser(String parser) {
        if(parser.equalsIgnoreCase("c"))
            return new CParser();
        else if(parser.equalsIgnoreCase("cpp"))
            return new CPPParser();
        else if(parser.equalsIgnoreCase("py"))
            return new PythonParser();
        else
            return null;
    }

    @Override
    public Font getFont(String font) {
        return null;
    }
}

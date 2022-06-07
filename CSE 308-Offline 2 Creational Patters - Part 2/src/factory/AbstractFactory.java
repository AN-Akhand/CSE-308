package factory;

import font.Font;
import parser.Parser;

abstract public class AbstractFactory {
    abstract public Parser getParser(String parser);
    abstract public Font getFont(String font);
}

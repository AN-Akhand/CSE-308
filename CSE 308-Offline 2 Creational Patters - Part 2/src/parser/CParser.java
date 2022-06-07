package parser;

public class CParser implements Parser{
    @Override
    public void showInfo() {
        System.out.println("CParser");
    }

    @Override
    public void parse() {
        System.out.println("Parsing .c file");
    }
}

package parser;

public class CPPParser implements Parser{
    @Override
    public void showInfo() {
        System.out.println("CPPParser");
    }

    @Override
    public void parse() {
        System.out.println("Parsing .cpp file");
    }
}

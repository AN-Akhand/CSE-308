package parser;

public class PythonParser implements Parser{
    @Override
    public void showInfo() {
        System.out.println("PythonParser");
    }

    @Override
    public void parse() {
        System.out.println("Parsing .py file");
    }
}

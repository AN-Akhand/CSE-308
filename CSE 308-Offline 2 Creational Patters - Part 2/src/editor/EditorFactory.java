package editor;

import factory.AbstractFactory;
import factory.FontFactory;
import factory.ParserFactory;

public class EditorFactory {
    public Editor getEditor(String filename){
        String[] s = filename.split("\\.");
        AbstractFactory fontFactory = new FontFactory();
        AbstractFactory parserFactory = new ParserFactory();
        if(Editor.isRunning()){
            if(parserFactory.getParser(s[1]).getClass().equals(Editor.getEditor().parser.getClass())){
                return Editor.getEditor();
            }
            else{
                System.out.println("Previous instance needs to exit");
                Editor.exitEditor();
                return Editor.getEditor(parserFactory.getParser(s[1]), fontFactory.getFont(s[1]));
            }
        }
        else {
            return Editor.getEditor(parserFactory.getParser(s[1]), fontFactory.getFont(s[1]));
        }
    }
}

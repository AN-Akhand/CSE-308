package editor;

import font.Font;
import parser.Parser;

public class Editor {
    Parser parser;
    Font font;
    private static Editor editor = null;
    private Editor(Parser parser, Font font){
        this.parser = parser;
        this.font = font;
    }
    public static Editor getEditor(Parser parser, Font font){
        if(editor == null){
            editor = new Editor(parser, font);
        }
        return editor;
    }
    public static Editor getEditor(){
        return editor;
    }
    public static void exitEditor(){
        editor = null;
    }
    public static boolean isRunning(){
        return editor != null;
    }
    public void showInfo(){
        parser.showInfo();
        font.showInfo();
    }
}

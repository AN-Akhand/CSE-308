

import editor.Editor;
import editor.EditorFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename;
        while(true){
            filename = reader.readLine();
            EditorFactory editorFactory = new EditorFactory();
            Editor editor = editorFactory.getEditor(filename);
            editor.showInfo();
        }
    }
}

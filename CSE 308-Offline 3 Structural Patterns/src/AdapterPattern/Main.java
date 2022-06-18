package AdapterPattern;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        CalculateSum spaceSum = new CalculateSumSpace();
        spaceSum.calculateSum("input.txt");
        AnotherSum tildeSum = new TildeSumAdapter();
        tildeSum.calculateTildeSum("input_tilde.txt");
    }
}

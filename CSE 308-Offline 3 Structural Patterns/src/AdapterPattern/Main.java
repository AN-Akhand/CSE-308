package AdapterPattern;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CalculateSum calculateSum = new CalculateSum();
        calculateSum.calculateSum("src\\AdapterPattern\\input.txt");
    }
}

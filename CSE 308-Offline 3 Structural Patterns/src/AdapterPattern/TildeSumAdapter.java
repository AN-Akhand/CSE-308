package AdapterPattern;

import java.io.*;

public class TildeSumAdapter implements AnotherSum {

    CalculateSum spaceSum;

    TildeSumAdapter(){
        spaceSum = new CalculateSumSpace();
    }
    @Override
    public void calculateTildeSum(String filename) throws IOException {
        File input = File.createTempFile("temp", ".txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("input_tilde.txt")));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(input)));
        writer.write(reader.readLine().replace("~", " "));
        writer.close();
        spaceSum.calculateSum(input.getAbsolutePath());
        input.deleteOnExit();
    }
}

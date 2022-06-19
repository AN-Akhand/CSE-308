package AdapterPattern;

import java.io.*;

public class CalculateSumSpace implements CalculateSum{
    @Override
    public void calculateSum(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        String[] numbers = reader.readLine().split(" ");
        int sum = 0;
        for(String s : numbers){
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}

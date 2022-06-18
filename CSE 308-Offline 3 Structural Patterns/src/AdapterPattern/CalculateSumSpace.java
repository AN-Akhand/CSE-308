package AdapterPattern;

import java.io.*;

public class CalculateSumSpace implements CalculateSum{
    @Override
    public void calculateSum(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        String s = reader.readLine();
        String[] numbers;
        int n1, n2;
        while(s != null){
            numbers = s.split(" ");
            n1 = Integer.parseInt(numbers[0]);
            n2 = Integer.parseInt(numbers[1]);
            System.out.println(n1 + n2);
            s = reader.readLine();
        }
    }
}

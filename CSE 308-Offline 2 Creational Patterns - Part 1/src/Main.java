import builders.DeluxeBuilder;
import builders.IBuilder;
import builders.OptimalBuilder;
import builders.PoorBuilder;
import products.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s;
        IBuilder builder = null;
        Director director = new Director();
        while(true) {
            System.out.println("Enter the package, the connection type and the number of displays in order: ");
            s = reader.readLine().split(" ");
            if(s[0].equalsIgnoreCase("Deluxe")){
                builder = new DeluxeBuilder(s[1], Integer.parseInt(s[2]));
            }
            else if(s[0].equalsIgnoreCase("Optimal")){
                builder = new OptimalBuilder(s[1], Integer.parseInt(s[2]));
            }
            else if(s[0].equalsIgnoreCase("Poor")){
                builder = new PoorBuilder(s[1], Integer.parseInt(s[2]));
            }
            if(builder == null){
                continue;
            }
            director.construct(builder);
            Product qms = builder.getProduct();
            System.out.println(qms.getPrice());
        }
    }
}

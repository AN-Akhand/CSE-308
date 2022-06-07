package products;

import part.Part;

import java.util.ArrayList;

public class QueueManagementSystem extends Product {
    ArrayList<Part> parts;

    public QueueManagementSystem(){
        parts = new ArrayList<>();
    }

    @Override
    public void showProductInfo() {
        for(Part p : parts){
            p.showProductInfo();
        }
    }

    @Override
    public void add(Part part) {
        parts.add(part);
        price += part.getPrice();
        System.out.print("Adding ");
        part.showProductInfo();
    }
}

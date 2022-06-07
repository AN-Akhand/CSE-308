package builders;

import connectivity.SIMCard;
import connectivity.WiFiModule;
import controller.WebController;
import display.LEDMatrix;
import displayUnit.DisplayUnit;
import processor.ATMega32;
import products.Product;
import products.QueueManagementSystem;

public class PoorBuilder implements IBuilder{
    private Product product;
    String type;
    int noOfDisplayUnits;


    public PoorBuilder(String conn, int noOfDisplayUnits){
        product = new QueueManagementSystem();
        type = conn;
        this.noOfDisplayUnits = noOfDisplayUnits;
    }

    @Override
    public void buildDisplayUnit() {
        for(int i = 0; i < noOfDisplayUnits; i++){
            product.add(new DisplayUnit(new LEDMatrix(), new ATMega32()));
        }
    }

    @Override
    public void buildConnectivity() {
        if(type.equalsIgnoreCase("WiFi")){
            product.add(new WiFiModule());
        }
        else if(type.equalsIgnoreCase("Mobile")){
            product.add(new SIMCard());
        }
    }

    @Override
    public void buildController() {
        product.add(new WebController());
    }

    @Override
    public Product getProduct() {
        return product;
    }
}

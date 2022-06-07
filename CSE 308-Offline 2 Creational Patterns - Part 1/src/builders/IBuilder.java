package builders;

import part.Part;
import products.Product;

public interface IBuilder {
     void buildDisplayUnit();
     void buildConnectivity();
     void buildController();
    Product getProduct();
}

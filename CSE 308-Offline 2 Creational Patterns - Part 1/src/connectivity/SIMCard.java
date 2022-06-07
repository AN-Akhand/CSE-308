package connectivity;

public class SIMCard extends Connectivity{
    public SIMCard() {
        price = 100;
    }

    @Override
    public void connect() {
        System.out.println("Connected via mobile data");
    }

    @Override
    public void showProductInfo() {
        System.out.println("SIMCard");
    }
}

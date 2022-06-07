package connectivity;

public class WiFiModule extends Connectivity{
    public WiFiModule(){
        price = 200;
    }
    @Override
    public void connect() {
        System.out.println("Connected via WiFi through broadband");
    }

    @Override
    public void showProductInfo() {
        System.out.println("WiFiModule");
    }
}

package part;

abstract public class Part {
    public int price;
    abstract public void showProductInfo();
    public int getPrice(){
        return price;
    }
}

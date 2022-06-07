package controller;

public class WebController extends Controller{

    public WebController(){
        price = 300;
    }
    @Override
    public void control(){
        System.out.println("Controlling via web");
    }

    @Override
    public void showProductInfo() {
        System.out.println("WebController");
    }
}

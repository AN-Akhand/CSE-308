package connectivity;

import part.Part;

abstract public class Connectivity extends Part {
    int yearlyCost;

    abstract public void connect();

    public int getYearlyCost() {
        return yearlyCost;
    }
}

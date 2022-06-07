import builders.IBuilder;

public class Director {
    IBuilder builder;
    public void construct(IBuilder builder){
        this.builder = builder;
        builder.buildDisplayUnit();
        builder.buildController();
        builder.buildConnectivity();
    }
}

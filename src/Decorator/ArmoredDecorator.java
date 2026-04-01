package Decorator;

public class ArmoredDecorator implements IVehicle {
    private IVehicle v;

    public ArmoredDecorator(IVehicle v) {
        this.v = v;
    }

    public String getDescription() {
        return v.getDescription() + " + Blindage certifié";
    }
}

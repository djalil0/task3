package Decorator;

public class SimpleVehicle implements IVehicle {
    private String name;

    public SimpleVehicle(String n) {
        this.name = n;
    }

    public String getDescription() {
        return "Voiture " + name;
    }
}

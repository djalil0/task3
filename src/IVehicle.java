public interface IVehicle {
    String getDescription();
}
class SimpleVehicle implements IVehicle {
    private String name;
    public SimpleVehicle(String n) { this.name = n; }
    public String getDescription() { return "Voiture " + name; }
}
class ArmoredDecorator implements IVehicle {
    private IVehicle v;
    public ArmoredDecorator(IVehicle v) { this.v = v; }
    public String getDescription() { return v.getDescription() + " + Blindage certifié"; }
}
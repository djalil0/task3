public interface VehicleStarter {
    void start();
}
class RealEngine implements VehicleStarter {
    public void start() { System.out.println("Врум! Двигатель запустился."); }
}
class CarProxy implements VehicleStarter {
    private RealEngine engine = new RealEngine();
    private int age;
    public CarProxy(int age) { this.age = age; }
    public void start() {
        if (age < 18) System.out.println("[PROXY] Доступ запрещен: несовершеннолетний водитель.");
        else engine.start();
    }
}

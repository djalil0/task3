public interface StandardSocket {
    void plugIn();
}
class Tesla {
    void fastCharge() {
        System.out.println("[ADAPTER] Быстрая зарядка Tesla через адаптер.");
    }
}
class TeslaAdapter implements StandardSocket {
    private Tesla t;
    public TeslaAdapter(Tesla t) { this.t = t; }
    public void plugIn() { t.fastCharge(); }
}
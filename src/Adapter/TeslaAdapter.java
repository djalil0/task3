package Adapter;

public class TeslaAdapter implements StandardSocket {
    private Tesla t;

    public TeslaAdapter(Tesla t) {
        this.t = t;
    }

    public void plugIn() {
        t.fastCharge();
    }
}

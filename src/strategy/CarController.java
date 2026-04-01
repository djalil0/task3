package strategy;

public class CarController {
    private DriveMode mode;

    public void setMode(DriveMode m) {
        this.mode = m;
    }

    public void drive() {
        mode.execute();
    }
}

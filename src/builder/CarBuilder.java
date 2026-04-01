package builder;

public class CarBuilder {
    private final Car car = new Car();

    public CarBuilder setModel(String m) {
        car.model = m;
        return this;
    }

    public CarBuilder setEngine(String e) {
        car.engien = e;
        return this;
    }

    public CarBuilder setColor(String c) {
        car.color = c;
        return this;
    }

    public CarBuilder addGPS() {
        car.hasGPS = true;
        return this;
    }

    public Car build() {
        return car;
    }
}

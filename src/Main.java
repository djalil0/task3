import Adapter.StandardSocket;
import Adapter.Tesla;
import Adapter.TeslaAdapter;
import Chain_of_Responsibility.CheckHandler;
import Chain_of_Responsibility.EngineHandler;
import Chain_of_Responsibility.WheelHandler;
import Decorator.ArmoredDecorator;
import Decorator.IVehicle;
import Decorator.SimpleVehicle;
import builder.Car;
import builder.CarBuilder;
import strategy.CarController;
import strategy.EcoMode;
import strategy.SportMode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("--- 1. BUILDER (Создание автомобиля) ---");
    Car myCar = new CarBuilder()
            .setModel("Adapter.Tesla Model S")
            .setEngine("Электрический")
            .setColor("Красный")
            .addGPS()
            .build();
    System.out.println("Автомобиль создан : " + myCar.getModel());

    System.out.println("\n--- 2. DECORATOR (Добавлены роскошные опции) ---");
    IVehicle basicCar = new SimpleVehicle("Adapter.Tesla");
    IVehicle armoredCar = new ArmoredDecorator(basicCar);
    System.out.println("Описание : " + armoredCar.getDescription());

    System.out.println("\n--- 3. PROXY (Контроль доступа по возрасту) ---");
    Proxy.VehicleStarter driver1 = new Proxy.CarProxy(16);
    driver1.start();
    Proxy.VehicleStarter driver2 = new Proxy.CarProxy(25);
    driver2.start();

    System.out.println("\n--- 4. STRATEGY (Изменение режима вождения) ---");
    CarController controller = new CarController();
    controller.setMode(new SportMode());
    controller.drive();
    controller.setMode(new EcoMode());
    controller.drive();

    System.out.println("\n--- 5. CHAIN OF RESPONSIBILITY (Diagnostic) ---");
    CheckHandler engine = new EngineHandler();
    CheckHandler wheel = new WheelHandler();
    engine.setNext(wheel);

    System.out.println("Анализ проблем с двигателем :");
    engine.handle("Panne Engine");
    System.out.println("Анализ проблем с шинами :");
    engine.handle("Crevaison Wheel");

    System.out.println("\n--- 6. ADAPTER (Recharge sur prise standard) ---");
    Tesla myTesla = new Tesla();
    StandardSocket charger = new TeslaAdapter(myTesla);
    charger.plugIn();
}



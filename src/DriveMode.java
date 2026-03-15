interface DriveMode { void execute(); }
class SportMode implements DriveMode { public void execute() { System.out.println("Режим SPORT: Максимальная мощность!"); } }
class EcoMode implements DriveMode { public void execute() { System.out.println("ЭКО-режим: энергосбережение."); } }
class CarController {
    private DriveMode mode;
    public void setMode(DriveMode m) { this.mode = m; }
    public void drive() { mode.execute(); }
}
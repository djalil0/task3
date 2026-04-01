package strategy;

public class EcoMode implements DriveMode {
    public void execute() {
        System.out.println("ЭКО-режим: энергосбережение.");
    }
}

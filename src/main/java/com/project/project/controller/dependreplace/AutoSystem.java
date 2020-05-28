package com.project.project.controller.dependreplace;

/**
 * @author shenya.ji.o
 * @description: 2
 **/

public class AutoSystem {
    private final ICar iCar;
    public AutoSystem (ICar iCar) {
        this.iCar = iCar;
    }
    public void runCar() {
        iCar.run();
    }
    public void turnCar() {
        iCar.turn();
    }
    public void stopCar() {
        iCar.stop();
    }

    public static void main(String[] args) {
        AutoSystem autoSystem = new AutoSystem(new HondaCar());
        autoSystem.runCar();
        autoSystem.turnCar();
        autoSystem.stopCar();
        AutoSystem autoSystem1 = new AutoSystem(new FordCar());
        autoSystem1.runCar();
        autoSystem1.turnCar();
        autoSystem1.stopCar();
    }

}

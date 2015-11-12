package com.j2.facade.smarthome;

public class SmartHomeTestDrive {
    public static void main(String[] args) {
        Light light = new Light("My Light");
        Door door = new Door("My Door");
        Desktop desktop = new Desktop("My Desktop");
 
        SmartHomeFacade smarthome = new SmartHomeFacade(light, door, desktop);
        smarthome.beginStudy();
        smarthome.endStudy();
    }
}
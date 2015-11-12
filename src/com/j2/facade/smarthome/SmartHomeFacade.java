package com.j2.facade.smarthome;

public class SmartHomeFacade {
  private Light light;
  private Door door;
  private Desktop desktop;
  
  public SmartHomeFacade(Light light, Door door, Desktop desktop) {
    this.light = light;
    this.door = door;
    this.desktop = desktop;
  }
  public void beginStudy() {
    System.out.println("Begin studying...");
    door.close();
    light.setColor("white");
    desktop.on();
    System.out.println("\n");
  }
  public void endStudy() {
    System.out.println("End Studying...");
    desktop.off();
    light.setColor("orange");
    door.open();
    System.out.println("\n");
  }
}
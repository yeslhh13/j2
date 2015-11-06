package com.j2.command.party;

public class Hottub {
  private int temperature;
  
  public Hottub() {}
  public void on() {
    temperature = 104;
    System.out.println("Hottub is heating to a steaming "
                      + this.temperature + " degrees");
  }
  public void off() {
    temperature = 98;
    System.out.println("Hottub is cooling to " + this.temperature
                      + " degrees");
  }
  public void steam(int temperature) {
    this.temperature = temperature;
    if (temperature == 98)
      off();
    else
      System.out.println("Hottub is bubbling!");
  }
  public int getTemperature() {
    return this.temperature;
  }
}
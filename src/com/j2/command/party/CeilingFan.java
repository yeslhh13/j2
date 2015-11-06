package com.j2.command.party;

public class CeilingFan {
  private String location;
  private int wind;
  
  public CeilingFan(String location) {
    this.location = location;
  }
  public void on() {
    wind = 100;
    System.out.println(this.location + " ceiling fan is on");
  }
  public void off() {
    wind = 0;
    System.out.println(this.location + " ceiling fan is off");
  }
  public void setWind(int wind) {
    this.wind = wind;
    if (wind == 0)
      off();
    else
      System.out.println(this.location + " ceiling fan wind is set to "
                           + this.wind + "%");
  }
  public int getWind() {
    return this.wind;
  }
}
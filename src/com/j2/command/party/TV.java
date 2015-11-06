package com.j2.command.party;

public class TV {
  private String mode;
  private String location;
  
  public TV(String location) {
    this.location = location;
  }
  public void on() {
    mode = "TV";
    System.out.println(this.location + " TV is on");
  }
  public void off() {
    mode = "DVD";
    System.out.println(this.location + " TV is off");
  }
  public void setMode(String mode) {
    this.mode = mode;
    System.out.println(this.location + " TV mode is set for " + this.mode);
  }
  public String getMode() {
    return this.mode;
  }
}
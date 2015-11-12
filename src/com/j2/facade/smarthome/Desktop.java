package com.j2.facade.smarthome;

public class Desktop {
  String description;
  
  public Desktop(String description) {
    this.description = description;
  }
  public void on() {
    System.out.println(description + " on");
  }
  public void off() {
    System.out.println(description + " off");
  }
  public String toString() {
    return description;
  }
}
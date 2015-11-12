package com.j2.facade.smarthome;

public class Light {
  String description;
  String color;
  
  public Light(String description) {
    this.description = description;
  }
  public void on() {
    System.out.println(description + " on");
  }
  public void off() {
    System.out.println(description + " off");
  }
  public void setColor(String color) {
    this.color = color;
    System.out.println(description + " color set to " + color);
  }
}
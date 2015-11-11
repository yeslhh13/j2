package com.j2.facade.home;

public class Projector {
  private String description;
  private DvdPlayer dvd;
  
  public Projector(String description, DvdPlayer dvd) {
    this.description = description;
    this.dvd = dvd;
  }
  public void on() {
    System.out.println(description + " on");
  }
  public void off() {
    System.out.println(description + " off");
  }
  public void wideScreenMode() {
    System.out.println(description + "in widescreen mode (16 x 9 aspect ratio)");
  }
  public String toString() {
    return description;
  }
}
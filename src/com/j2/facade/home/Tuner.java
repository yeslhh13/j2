package com.j2.facade.home;

public class Tuner {
  private String description;
  private Amplifier amplifier;
  private double frequency;
  
  public Tuner(String description, Amplifier amplifier) {
    this.description = description;
    this.amplifier = amplifier;
  }
  public void on() {
    System.out.println(description + " on");
  }
  public void off() {
    System.out.println(description + " off");
  }
  public void setFrequency(double frequency) {
    System.out.println(description + " setting frequency to " + frequency);
    this.frequency = frequency;
  }
  public String toString() {
    return description;
  }
}
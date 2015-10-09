package com.j2.decorator;

public class Latte extends Beverage {
  public Latte() {
    description = "Latte";
  }
  
  public double cost() {
    return .59;
  }
}
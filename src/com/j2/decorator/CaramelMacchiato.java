package com.j2.decorator;

public class CaramelMacchiato extends Beverage {
  public CaramelMacchiato() {
    description = "Caramel Macchiato";
  }
  
  public double cost() {
    return 2.99;
  }
}
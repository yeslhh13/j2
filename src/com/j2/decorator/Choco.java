package com.j2.decorator;

public class Choco extends CondimentDecorator {
  public Choco(Beverage beverage){
    this.beverage = beverage;
  }
  
  public String getDescription() { 
    return beverage.getDescription() + ", Choco";
  }
  
  public double cost(){
    return .25 + beverage.cost();
  }
}
package com.j2.decorator;

public class StarbuzzCoffee {
  public static void main(String args[]) {
    Beverage beverage1 = new DarkRoast();
    beverage1 = new Mocha(beverage1);
    beverage1 = new Mocha(beverage1);
    beverage1 = new Whip(beverage1);
    System.out.println(beverage1.getDescription()
                         + " $" + beverage1.cost());
    
    Beverage beverage2 = new CaramelMacchiato();
    System.out.println(beverage2.getDescription()
                         + " $" + beverage2.cost());
    
    Beverage beverage3 = new Latte();
    beverage3 = new Whip(beverage3);
    beverage3 = new Choco(beverage3);
    beverage3 = new Mocha(beverage3);
    System.out.println(beverage3.getDescription()
                         + " $" + beverage3.cost());
  }
}
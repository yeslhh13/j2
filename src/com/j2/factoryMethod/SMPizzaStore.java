package com.j2.factoryMethod;

public class SMPizzaStore extends PizzaStore {
  protected Pizza createPizza(String item) {
    if (item.equals("potato"))
      return new SMStylePotatoPizza();
    else
      return null;
  }
}
package com.j2.abstractFactory;

public abstract class Pizza {
  String name;
  Dough dough;
  Cheese cheese;
  
  abstract void prepare();
  void bake() {
    System.out.println("Baking..");
  }
  void cut() {
    System.out.println("Cutting..");
  }
  void box() {
    System.out.println("Boxing..");
  }
  public String getName() {
    return name;
  }
  public String toString() {
    System.out.println("-----" + name + "-----");
    return name;
  }
}
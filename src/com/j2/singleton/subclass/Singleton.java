package com.j2.singleton.subclass;

public class Singleton {
  protected static Singleton instance;
  
  protected Singleton() {}
  
  public static Singleton getInstance() {
    if (instance == null) {
      System.out.println("Creating a new instance");
      instance = new Singleton();
    }
    return instance;
  }
}
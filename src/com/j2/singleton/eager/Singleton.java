package com.j2.singleton.eager;

public class Singleton {
  private static Singleton instance = new Singleton();
  private static int numCalled = 0;
  
  private Singleton() {}
  
  public static Singleton getInstance() {
    System.out.println("numCalled: " + numCalled++);
    return instance;
  }
}
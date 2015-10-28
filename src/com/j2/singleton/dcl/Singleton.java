package com.j2.singleton.dcl;

public class Singleton {
  private volatile static Singleton instance;
  private static int numCalled = 0;
  
  private Singleton() {}
  
  public static Singleton getInstance() {
    if (instance == null) {
      synchronized(Singleton.class) {
        if (instance == null)
          instance = new Singleton();
      }
    }
    System.out.println("numCalled: " + numCalled++);
    return instance;
  }
}
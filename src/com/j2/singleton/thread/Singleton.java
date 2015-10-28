package com.j2.singleton.thread;

public class Singleton {
  private static Singleton instance;
  private static int numCalled = 0;
  
  private Singleton() {}
  
  public static synchronized Singleton getInstance() {
    if (instance == null)
      instance = new Singleton();
    System.out.println("numCalled: " + numCalled++);
    return instance;
  }
}
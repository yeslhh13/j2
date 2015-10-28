package com.j2.singleton.subclass;

public class CoolerSingleton extends Singleton {
  protected static Singleton instance;
  
  private CoolerSingleton() {
    super();
  }
}
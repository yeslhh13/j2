package com.j2.singleton.subclass;

public class HotterSingleton extends Singleton {
  protected static Singleton instance;
  
  private HotterSingleton() {
    super();
  }
}
package com.j2.singleton.subclass;

public class SingletonTestDrive {
  public static void main(String[] args) {
    Singleton foo = CoolerSingleton.getInstance();
    Singleton bar = HotterSingleton.getInstance();
  }
}
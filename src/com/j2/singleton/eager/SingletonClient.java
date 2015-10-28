package com.j2.singleton.eager;

public class SingletonClient {
  public static void main(String[] args) {
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    Singleton s3 = Singleton.getInstance();
  }
}
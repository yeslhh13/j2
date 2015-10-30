package com.j2.singleton.spooler;

public class PrinterSpooler {
  private boolean ink;
  private boolean printed;
  private static PrinterSpooler instance;
  private static int numCalled = 0;
  
  private PrinterSpooler(){
    ink = true;
    printed = true;
  }
  
  public static PrinterSpooler getInstance() {
    if (instance == null) {
      System.out.println("Creating new Printer Spooler instance");
      instance = new PrinterSpooler();
    }
    System.out.println("Returning instance of Printer Spooler");
    System.out.println("numCalled: " + numCalled++);
    return instance;
  }
  
  public void spool() {
    if (isInk()) {
      ink = false;
      printed = false;
    }
  }
  
  public void drain() {
    if (!isInk() && isPrinted())
      ink = true;
  }
  
  public void print() {
    if (!isInk() && !isPrinted())
      printed = true;
  }
  
  public boolean isInk() {
    return ink;
  }
  
  public boolean isPrinted() {
    return printed;
  }
}
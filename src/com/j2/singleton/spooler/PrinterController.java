package com.j2.singleton.spooler;

public class PrinterController {
  public static void main(String[] args) {
    PrinterSpooler ps1 = PrinterSpooler.getInstance();
    PrinterSpooler ps2 = PrinterSpooler.getInstance();
  }
}
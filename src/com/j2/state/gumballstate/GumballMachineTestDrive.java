package com.j2.state.gumballstate;

public class GumballMachineTestDrive {
  public static void main(String[] args) {
    GumballMachine gumballMachine = new GumballMachine(5);
    
    System.out.println(gumballMachine);
    
    gumballMachine.insertQuarter("quarter");
    gumballMachine.turnCrank();
    
    System.out.println(gumballMachine);
    
    gumballMachine.insertQuarter("quarter");
    gumballMachine.turnCrank();
    gumballMachine.insertQuarter("penny");
    gumballMachine.turnCrank();
    
    System.out.println(gumballMachine);
    
    gumballMachine.insertQuarter("quarter");
    gumballMachine.turnCrank();
    
    System.out.println(gumballMachine);
  }
}
package com.j2.state.gumballstate;

public class BrokenState implements State {
  GumballMachine gumballMachine;
  
  public BrokenState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  public void insertQuarter(String coin) {
    if (coin.toLowerCase() == "quarter") {
      System.out.println("You inserted a quarter");
      gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
    else 
      System.out.println("You inserted a wrong coin");
  }
  public void ejectQuarter() {
    System.out.println("You inserted a wrong coin and the machine is broken");
  }
  public void turnCrank() {
    System.out.println("Sorry, the machine is broken, so you can't turn the crank");
  }
  public void dispense() {
    System.out.println("Sorry, the machine is broken, so you can't get a gumball");
  }
  public String toString() {
    return "machine broken down";
  }
}
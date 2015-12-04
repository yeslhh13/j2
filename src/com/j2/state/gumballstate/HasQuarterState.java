package com.j2.state.gumballstate;

public class HasQuarterState implements State {
  GumballMachine gumballMachine;
  public HasQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  public void insertQuarter(String coin) {
    if (coin != "quarter") {
      System.out.println("You inserted a wrong coin");
      gumballMachine.setState(gumballMachine.getBrokenState());
    }
    else
      System.out.println("You can't insert another quarter");
  }
  public void ejectQuarter() {
    System.out.println("Quarter returned");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }
  public void turnCrank() {
    System.out.println("You turned...");
    gumballMachine.setState(gumballMachine.getSoldState());
  }
  public void dispense() {
    System.out.println("No gumball dispensed");
  }
  public String toString() {
    return "waiting for turn of crank";
  }
}
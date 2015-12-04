package com.j2.state.gumballstate;

public class GumballMachine {
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  State brokenState;
  
  State state = soldOutState;
  int count = 0;
  
  public GumballMachine(int num) {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    brokenState = new BrokenState(this);
    
    this.count = num;
    if (num > 0)
      state = noQuarterState;
  }
  public void insertQuarter(String coin) {
    state.insertQuarter(coin);
  }
  public void ejectQuarter() {
    state.ejectQuarter();
  }
  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }
  void setState(State state) {
    this.state = state;
  }
  void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count != 0)
      count--;
  }
  int getCount() {
    return count;
  }
  void refill(int count) {
    this.count = count;
    state = noQuarterState;
  }
  public State getState() {
    return state;
  }
  public State getSoldOutState() {
    return soldOutState;
  }
  public State getNoQuarterState() {
    return noQuarterState;
  }
  public State getHasQuarterState() {
    return hasQuarterState;
  }
  public State getSoldState() {
    return soldState;
  }
  public State getBrokenState() {
    return brokenState;
  }
  public String toString() {
    StringBuffer result = new StringBuffer();
    
    result.append("\nMighty Gumball, Inc.");
    result.append("\nJava-enabled Standing Gumball Model #2004");
    result.append("\nInventory: " + count + " gumball");
    
    if (count != 1)
      result.append("s");
    result.append("\n");
    result.append("Machine is " + state + "\n");
    
    return result.toString();
  }
}
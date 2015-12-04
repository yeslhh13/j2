package com.j2.state.gumballstate;

public interface State {
  public void insertQuarter(String coin);
  public void ejectQuarter();
  public void turnCrank();
  public void dispense();
}
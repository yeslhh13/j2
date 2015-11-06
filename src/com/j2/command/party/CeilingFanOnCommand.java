package com.j2.command.party;

public class CeilingFanOnCommand implements Command {
  private CeilingFan cf;
  private int wind;
  
  public CeilingFanOnCommand(CeilingFan cf) {
    this.cf = cf;
  }
  public void execute() {
    this.wind = cf.getWind();
    cf.on();
  }
  public void undo() {
    cf.setWind(wind);
  }
}
package com.j2.command.party;

public class CeilingFanOffCommand implements Command {
  private CeilingFan cf;
  private int wind;
  
  public CeilingFanOffCommand(CeilingFan cf) {
    this.cf = cf;
  }
  public void execute() {
    this.wind = cf.getWind();
    cf.off();
  }
  public void undo() {
    cf.setWind(wind);
  }
}
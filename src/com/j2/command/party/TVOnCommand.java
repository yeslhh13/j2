package com.j2.command.party;

public class TVOnCommand implements Command {
  private TV tv;
  private String mode;
  
  public TVOnCommand(TV tv) {
    this.tv = tv;
  }
  public void execute() {
    mode = tv.getMode();
    tv.on();
  }
  public void undo() {
    tv.setMode(mode);
  }
}
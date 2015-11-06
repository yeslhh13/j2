package com.j2.command.party;

public class TVOffCommand implements Command {
  private TV tv;
  private String mode;
  
  public TVOffCommand(TV tv) {
    this.tv = tv;
  }
  public void execute() {
    mode = tv.getMode();
    tv.off();
  }
  public void undo() {
    tv.setMode(mode);
  }
}
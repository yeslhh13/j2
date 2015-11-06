package com.j2.command.simpleRemote;

public class GarageDoorOpenCommand implements Command {
  private GarageDoor garageDoor;
  public GarageDoorOpenCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }
  public void execute() {
    garageDoor.open();
  }
}
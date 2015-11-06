package com.j2.command.simpleRemote;

public class SimpleRemoteControl {
  Command slot;
  public SimpleRemoteControl(){}
  public void setCommand(Command command) {
    slot = command;
  }
  public void buttonWasPressed() {
    slot.execute();
  }
}
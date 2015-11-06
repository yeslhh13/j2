package com.j2.command.party;

import java.util.*;

public class MacroCommand implements Command{
  private Command[] command;
  
  public MacroCommand(Command[] command) {
    this.command = command;
  }
  public void execute() {
    for (int i = 0; i < command.length; i++)
      command[i].execute();
  }
  public void undo() {
    for (int i = command.length - 1; i >= 0; i++)
      command[i].undo();
  }
}
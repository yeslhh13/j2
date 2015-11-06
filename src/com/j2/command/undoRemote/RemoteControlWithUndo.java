package com.j2.command.undoRemote;

import java.util.*;

public class RemoteControlWithUndo {
  Command[] onCommands;
  Command[] offCommands;
  Command undoCommand;
  
  public RemoteControlWithUndo() {
    onCommands = new Command[7];
    offCommands = new Command[7];
    
    Command noCommand = new NoCommand();
    
    for (int i = 0; i < 7; i++) {
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }
    undoCommand = noCommand;
  }
  public void setCommand(int slot, Command on, Command off) {
    onCommands[slot] = on;
    offCommands[slot] = off;
  }
  public void onButtonPressed(int slot) {
    onCommands[slot].execute();
    undoCommand = onCommands[slot];
  }
  public void offButtonPressed(int slot) {
    offCommands[slot].execute();
    undoCommand = offCommands[slot];
  }
  public void undoButtonPressed() {
    undoCommand.undo();
  }
  
  public String toString() {
    StringBuffer string = new StringBuffer();
    string.append("\n====== Remote Control ======\n");
    for (int i = 0; i < onCommands.length; i++)
      string.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                      + "     " + offCommands[i].getClass().getName() + "\n");
    string.append("[undo] " + undoCommand.getClass().getName() + "\n");
    return string.toString();
  }
}
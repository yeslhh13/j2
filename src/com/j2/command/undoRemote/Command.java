package com.j2.command.undoRemote;

public interface Command {
  public void execute();
  public void undo();
}
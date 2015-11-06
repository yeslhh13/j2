package com.j2.command.undoRemote;

public class DVDStopCommand implements Command {
  DVD dvd;
  int point;
  
  public DVDStopCommand(DVD dvd) {
    this.dvd = dvd;
  }
  public void execute() {
    point = dvd.getPoint();
    dvd.stop();
  }
  public void undo() {
    dvd.wind(point);
  }
}
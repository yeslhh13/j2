package com.j2.command.undoRemote;

public class DVDPlayCommand implements Command {
  DVD dvd;
  int point;
  
  public DVDPlayCommand(DVD dvd) {
    this.dvd = dvd;
  }
  public void execute() {
    point = dvd.getPoint();
    dvd.play();
  }
  public void undo() {
    dvd.wind(point);
  }
}
package com.j2.command.undoRemote;

public class RemoteControlTest {
  public static void main(String[] args) {
    RemoteControlWithUndo remote = new RemoteControlWithUndo();
    
    Light livingRoomLight = new Light("Living Room");
    
    LightOnCommand lron = new LightOnCommand(livingRoomLight);
    LightOffCommand lroff = new LightOffCommand(livingRoomLight);
    
    remote.setCommand(0, lron, lroff);
    
    remote.onButtonPressed(0);
    remote.offButtonPressed(0);
    System.out.println(remote);
    remote.undoButtonPressed();
    
    remote.offButtonPressed(0);
    remote.onButtonPressed(0);
    System.out.println(remote);
    remote.undoButtonPressed();
    
    System.out.println("=====================================");
    
    DVD dvd = new DVD();
    
    DVDPlayCommand play = new DVDPlayCommand(dvd);
    DVDStopCommand stop = new DVDStopCommand(dvd);
    
    remote.setCommand(1, play, stop);
    
    remote.onButtonPressed(1);
    remote.offButtonPressed(1);
    System.out.println(remote);
    remote.undoButtonPressed();
    
    remote.offButtonPressed(1);
    remote.onButtonPressed(1);
    System.out.println(remote);
    remote.undoButtonPressed();
  }
}
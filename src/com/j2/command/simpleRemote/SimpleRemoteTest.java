package com.j2.command.simpleRemote;

public class SimpleRemoteTest {
  public static void main(String[] args) {
    SimpleRemoteControl remote = new SimpleRemoteControl();
    
    Light light = new Light();
    LightOnCommand lightOn = new LightOnCommand(light);
    
    GarageDoor door = new GarageDoor();
    GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(door);
    
    remote.setCommand(lightOn);
    remote.buttonWasPressed();
    
    remote.setCommand(doorOpen);
    remote.buttonWasPressed();
  }
}
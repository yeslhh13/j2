package com.j2.command.party;

public class RemoteLoader {
  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();
    
    Light light = new Light("Living Room");
    TV tv = new TV("Living Room");
    Stereo stereo = new Stereo("Living Room");
    Hottub hottub = new Hottub();
    CeilingFan ceilingfan = new CeilingFan("Living Room");
 
    LightOnCommand lightOn = new LightOnCommand(light);
    StereoOnCommand stereoOn = new StereoOnCommand(stereo);
    TVOnCommand tvOn = new TVOnCommand(tv);
    HottubOnCommand hottubOn = new HottubOnCommand(hottub);
    CeilingFanOnCommand cfOn = new CeilingFanOnCommand(ceilingfan);
    LightOffCommand lightOff = new LightOffCommand(light);
    StereoOffCommand stereoOff = new StereoOffCommand(stereo);
    TVOffCommand tvOff = new TVOffCommand(tv);
    HottubOffCommand hottubOff = new HottubOffCommand(hottub);
    CeilingFanOffCommand cfOff = new CeilingFanOffCommand(ceilingfan);

    Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn, cfOn};
    Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff, cfOff};
  
    MacroCommand partyOnMacro = new MacroCommand(partyOn);
    MacroCommand partyOffMacro = new MacroCommand(partyOff);
  
    remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
    
    System.out.println(remoteControl);
    System.out.println("--- Pushing Macro On---");
    remoteControl.onButtonPressed(0);
    System.out.println("\n--- Pushing Macro Off---");
    remoteControl.offButtonPressed(0);
  }
}
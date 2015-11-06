package com.j2.command.party;

public class StereoOnCommand implements Command {
  private Stereo stereo;
  private int volume;
  
  public StereoOnCommand(Stereo stereo) {
    this.stereo = stereo;
  }
  public void execute() {
    volume = stereo.getVolume();
    stereo.on();
  }
  public void undo() {
    stereo.setVolume(volume);
  }
}
package com.j2.command.party;

public class StereoOffCommand implements Command {
  private Stereo stereo;
  private int volume;
  
  public StereoOffCommand(Stereo stereo) {
    this.stereo = stereo;
  }
  public void execute() {
    volume = stereo.getVolume();
    stereo.off();
  }
  public void undo() {
    stereo.setVolume(volume);
  }
}
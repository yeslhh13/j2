package com.j2.command.party;

public class HottubOffCommand implements Command {
  private Hottub hottub;
  private int temperature;
  
  public HottubOffCommand(Hottub hottub) {
    this.hottub = hottub;
  }
  public void execute() {
    temperature = hottub.getTemperature();
    hottub.off();
  }
  public void undo() {
    hottub.steam(temperature);
  }
}
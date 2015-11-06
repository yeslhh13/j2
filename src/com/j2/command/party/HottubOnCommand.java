package com.j2.command.party;

public class HottubOnCommand implements Command {
  private Hottub hottub;
  private int temperature;
  
  public HottubOnCommand(Hottub hottub) {
    this.hottub = hottub;
  }
  public void execute() {
    temperature = hottub.getTemperature();
    hottub.on();
  }
  public void undo() {
    hottub.steam(temperature);
  }
}
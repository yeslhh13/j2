package com.j2.observer;
import java.util.*;

public class WeatherStation {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    weatherData.setMeasurements(80, 65, 30.4f);
  }
}
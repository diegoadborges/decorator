package me.diego;

public class MargheritaPizza implements Pizza {

  @Override
  public Double getPrice() {
    return 20d;
  }

  @Override
  public String getDescription() {
    return "Margherita Pizza";
  }
}

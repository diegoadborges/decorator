package me.diego;

public class PepperoniPizza implements Pizza {

  @Override
  public Double getPrice() {
    return 15d;
  }

  @Override
  public String getDescription() {
    return "Pepperoni pizza";
  }
}

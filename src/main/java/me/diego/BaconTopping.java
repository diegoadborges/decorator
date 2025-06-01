package me.diego;

public class BaconTopping extends ToppingDecorator {

  public BaconTopping(Pizza pizza) {
    super(pizza);
  }

  @Override
  public String getDescription() {
    return this.pizza.getDescription() + ", Bacon";
  }

  @Override
  public Double getPrice() {
    return this.pizza.getPrice() + 3d;
  }
}

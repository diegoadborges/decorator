package me.diego;

public class CheeseTopping extends ToppingDecorator {
  public CheeseTopping(Pizza pizza) {
    super(pizza);
  }

  @Override
  public String getDescription() {
    return this.pizza.getDescription() + ", Extra Cheese";
  }

  @Override
  public Double getPrice() {
    return this.pizza.getPrice() + 2d;
  }
}

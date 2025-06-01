package me.diego;

public abstract class ToppingDecorator implements Pizza {
  protected Pizza pizza;

  public ToppingDecorator(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDescription() {
    return this.pizza.getDescription();
  }

  @Override
  public Double getPrice() {
    return this.pizza.getPrice();
  }
}

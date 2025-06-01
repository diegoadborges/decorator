package me.diego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PizzaDecoratorTest {

  @Test
  void testMargheritaPizzaBasics() {
    var pizza = new MargheritaPizza();

    assertEquals("Margherita Pizza", pizza.getDescription());
    assertEquals(20.00, pizza.getPrice(), 0.01);
  }

  @Test
  void testPepperoniPizzaBasics() {
    var pizza = new PepperoniPizza();

    assertEquals("Pepperoni pizza", pizza.getDescription());
    assertEquals(15.00, pizza.getPrice(), 0.01);
  }

  @Test
  void testMargheritaWithCheese() {
    var pizza = new CheeseTopping(new MargheritaPizza());

    assertEquals("Margherita Pizza, Extra Cheese", pizza.getDescription());
    assertEquals(22.00, pizza.getPrice(), 0.01);
  }

  @Test
  void testPepperoniWithBacon() {
    var pizza = new BaconTopping(new PepperoniPizza());

    assertEquals("Pepperoni pizza, Bacon", pizza.getDescription());
    assertEquals(18.00, pizza.getPrice(), 0.01);
  }

  @Test
  void testMargheritaWithCheeseAndBacon() {
    var pizza = new CheeseTopping(new BaconTopping(new MargheritaPizza()));

    assertEquals("Margherita Pizza, Bacon, Extra Cheese", pizza.getDescription());
    assertEquals(25.00, pizza.getPrice(), 0.01);
  }

  @Test
  void testPepperoniWithCheeseAndBacon() {
    Pizza pizza = new CheeseTopping(new BaconTopping(new PepperoniPizza()));

    assertEquals("Pepperoni pizza, Bacon, Extra Cheese", pizza.getDescription());
    assertEquals(20.00, pizza.getPrice(), 0.01);
  }
}

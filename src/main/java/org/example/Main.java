package org.example;

public class Main {
    public static void main(String[] args) {
        Pizza basePizza=new Pizza(true);    // for veg=true and non-veg=false
        basePizza.addExtraCheese();
        basePizza.addExtraToppings();
        basePizza.takeAway();
        basePizza.dineIn();
        basePizza.getBill();

        DeluxPizza dp=new DeluxPizza(true);
        dp.addExtraCheese();
        dp.addExtraToppings();
        dp.takeAway();
        dp.dineIn();
        dp.getBill();

    }
}
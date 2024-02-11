package org.example;

// Here we don't have any adding properties here automatically available all extra properties (add extra cheese and extra toppings)
public class DeluxPizza extends Pizza {

    public DeluxPizza(Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {}

    @Override
    public void addExtraToppings() {}
}

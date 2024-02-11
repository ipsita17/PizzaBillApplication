package org.example;

public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice=100;
    private int extraToppingsPrice=200;
    private int packingCharge=30;
    private int eatHere=0;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded =false;
    private boolean isExtraToppingsAdded =false;
    private boolean isReadyForTakeAway =false;
    private boolean isReadyForEatHere =false;


    public Pizza(Boolean veg) { //because the price of the pizza is fixed so don't need to create constructor
        this.veg = veg;

        if(this.veg)
        {
            price=300;
        }
        else{
            this.price=400;
        }
        basePizzaPrice=this.price;
    }

//    public void getPizzaPrice()
//    {
//        System.out.println(this.price);
//    }

    public void addExtraCheese()
    {
        isExtraCheeseAdded =true;
//        System.out.println("Extra Cheese is Added");
        this.price +=extraCheesePrice;
    }
    public void addExtraToppings()
    {
        isExtraToppingsAdded =true;
        this.price +=extraToppingsPrice;
    }
    public void takeAway()
    {
        isReadyForTakeAway =true;
        this.price +=packingCharge;
    }
    public void dineIn()
    {
        isReadyForEatHere =true;
        this.price +=eatHere;
    }
    public void getBill()
    {
        String bill="";
        System.out.println("Pizza: " +basePizzaPrice);
        if(isExtraCheeseAdded)
        {
            bill +="Extra Cheese is Added: "+extraCheesePrice + "\n";
        }
        if(isExtraToppingsAdded)
        {
            bill +="Extra Toppings is Added: "+extraToppingsPrice +"\n";
        }
        if(isReadyForTakeAway)
        {
            bill +="Ready for Take Away: " +packingCharge +"\n";
        }
        if(isReadyForEatHere)
        {
            bill +="Ready for Eat Here: " +eatHere +"\n";
        }
        bill +="Total bill: " +this.price +"\n";
        System.out.println(bill);
    }
}

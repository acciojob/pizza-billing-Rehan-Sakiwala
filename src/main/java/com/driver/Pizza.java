package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private int cheese,toppings;
    boolean extraCheeseAdded;
    boolean extraToppingsAdded;
    boolean takeAwayAdded;
    boolean billGenerated;


    private String bill="";

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
            this.toppings=70;
        }
        else{
            this.price=400;
            this.toppings=120;
        }
        this.cheese=80;
        this.billGenerated=false;
        this.extraCheeseAdded=false;
        this.extraToppingsAdded=false;
        this.takeAwayAdded=false;
        this.bill+="Base Price Of The Pizza: "+this.price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheeseAdded){
            this.price+=cheese;
            this.extraCheeseAdded=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppingsAdded) {
            this.price+=this.toppings;
            this.extraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAwayAdded){
            this.price+=20;
            takeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!billGenerated){
            if(extraCheeseAdded){
                this.bill+="\nExtra Cheese Added: "+cheese;
            }
            if(extraToppingsAdded){
                this.bill+="\nExtra Toppings Added: "+toppings;
            }
            if(takeAwayAdded){
                this.bill+="\nPaperbag Added: "+20;
            }
            this.bill+="\nTotal Price: "+this.price+"\n";
            billGenerated=true;

        }
        return this.bill;
    }
}

package com.company;

public enum Topping {

    MOZZARELLA("mozzarella"),
    MUSHROOM("mushroom"),
    ONION("onion"),
    PARMESAN("parmesan"),
    PINEAPPLE("pineapple"),
    ICE_CREAM("ice_cream"),
    HOT_DOG("hot_dog"),
    TOMATO("tomato"),
    AMERICAN("american"),
    NAPOLETANA("napoletana");


    private String topping;

    Topping (String topping){
        this.topping=topping;
    }

    @Override
    public String toString(){
        return topping;
    }
}

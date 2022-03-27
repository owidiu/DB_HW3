package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private final Type type;
    private List<Topping> topping;


    public Pizza(Builder builder){
        this.type=builder.type;
        this.topping=builder.topping;
    }

    public Type getType() {
        return type;
    }
    public List<Topping> getTopping(){
        return topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "type=" + type +
                ", topping=" + topping +
                '}';
    }

    public static class Builder {
        private Type type;
        private List<Topping> topping = new ArrayList<>();

        public Builder addType(Type type){
            this.type=type;
            return this;
        }

        public Builder addTopping(Topping topping){
            this.topping.add(topping);
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }
}

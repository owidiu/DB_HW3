package com.company;

import java.util.ArrayList;
import java.util.List;

class PizzaFactory implements Observable {

    public List<Observer> observerList;

    public String name;
    public String prajit;


    void Pizza(String name){
        this.name=name;
        this.observerList=new ArrayList<>();
    }

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void notifyAllObservers(){
        for(Observer observer: observerList){
            observer.update(prajit);
        }
    }

    void isBaked(boolean baked ){
        prajit=name+(baked);
        notifyAllObservers();
    }





}

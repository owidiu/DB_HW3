package com.company;

interface Observable {

    void addObserver(Observer observer);

    void notifyAllObservers();

}
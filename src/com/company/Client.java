package com.company;

public class Client implements Observer{

    public void order(){
        System.out.println("Client ordered pizza" );
    }

    @Override
    public void update(String message) {

    }
}

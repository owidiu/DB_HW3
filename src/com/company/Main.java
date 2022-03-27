package com.company;

public class Main {

    public static void main(String[] args) {

        Pizza Comanda1=new Pizza.Builder().addType(Type.MARGUERITA).addTopping(Topping.PINEAPPLE).build();
        System.out.println(Comanda1.toString());

        Pizza Comanda2=new Pizza.Builder().addType(Type.QUATROSTAGIONI).addTopping(Topping.TOMATO).build();
        System.out.println(Comanda2.toString());

        Pizza Comanda3=new Pizza.Builder().addType(Type.CAPRICIOSA).addTopping(Topping.NAPOLETANA).build();
        System.out.println(Comanda3.toString());

        Client client = new Client();
        OrderPizza order1=new OrderPizza();
        order1.execute(client);
    }
}

package com.company;

 class OrderPizza extends Order {
     @Override
     public void execute(Client client) {
         client.order();
     }
 }

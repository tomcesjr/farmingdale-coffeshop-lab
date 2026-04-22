package edu.farmingdale;

public class Order {
    private Drink drink;
    private int orderId;
    public Order(Drink drink, int orderId) {
        this.drink = drink;
        this.orderId = orderId;
    }

    public void printReceipt(){
        System.out.println("Order Id: " + orderId);
        System.out.println("Drink: " + drink);
    }
}

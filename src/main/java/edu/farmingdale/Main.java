package edu.farmingdale;
import java.util.Scanner;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Random r = new Random();
        int id = r.nextInt(100);
        Scanner scnr = new Scanner(System.in);
      Drink drink = new DrinkBuilder("Coffee", "Hot").setSize("Small").setMilk("Almond Milk").build();
      Order order1 = new Order(drink,id);
      order1.printReceipt();


    }
}
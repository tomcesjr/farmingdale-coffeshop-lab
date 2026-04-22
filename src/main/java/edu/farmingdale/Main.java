package edu.farmingdale;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      Drink drink1 = new DrinkBuilder("Coffee", "Large")
              .setMilk("Almond Milk")
              .setTemp("Hot")
              .build();
      Order order1 = new Order(drink1,1);
      order1.printReceipt();

      Drink drink2 = new DrinkBuilder("Latte","Large")
              .setMilk("Regular")
              .setShots(2)
              .setSweetener("Lavender")
              .setTemp("Iced")
              .build();
      Order order2 = new Order(drink2,2);
      order2.printReceipt();

      Drink drink3 = new DrinkBuilder("Tea","Medium")
              .setMilk("Skim Milk")
              .setTemp("Iced")
              .build();
      Order order3 = new Order(drink3,3);
      order3.printReceipt();

      Drink drink4=new DrinkBuilder("Cappuccino","Small")
              .setMilk("regular")
              .build();
      Order order4 = new Order(drink4,4);
      order4.printReceipt();


    }
}
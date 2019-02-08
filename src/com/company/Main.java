package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Customer Jane = new Customer(1, "Jane", 45.25);
        Customer Bob = new Customer(2, "Bob", 33.14);

        VendingMachine Food = new VendingMachine(1, "Food");
        VendingMachine Drink = new VendingMachine(2, "Drink");
        VendingMachine Office = new VendingMachine(3, "Office");

        Snack Chips = new Snack(1, "Chips", 36, 1.75, 1);
        Snack ChocolateBar = new Snack(2, "Chocolate Bar", 36, 1.00, 1);
        Snack Pretzel = new Snack(3, "Pretzel", 30, 2.00, 1);
        Snack Soda = new Snack(4, "Soda", 24, 2.50, 2);
        Snack Water = new Snack(5, "Water", 20, 2.75, 2);

        Jane.buy(Soda.getCost(3));
        Soda.addQuantity(-3);
        System.out.println("\nProcess: 1");
        System.out.println("Jane's cash on hand: $" + Jane.getCash());
        System.out.println("Soda quantity: " + Soda.getQuantity());

        Jane.buy(Pretzel.getCost(1));
        Pretzel.addQuantity(-1);
        System.out.println("\nProcess: 2");
        System.out.println("Jane's cash on hand: $" + Jane.getCash());
        System.out.println("Pretzel quantity: " + Pretzel.getQuantity());

        Bob.buy(ChocolateBar.getCost(2));
        ChocolateBar.addQuantity(-2);
        System.out.println("\nProcess: 3");
        System.out.println("Bob's cash on hand: $" + Bob.getCash());
        System.out.println("Chocolate Bar quantity: " + ChocolateBar.getQuantity());

        Jane.addCash(10.00);
        System.out.println("\nProcess: 4");
        System.out.println("Jane's cash on hand: $" + Jane.getCash());

        Jane.buy(ChocolateBar.getCost(1));
        ChocolateBar.addQuantity(-1);
        System.out.println("\nProcess: 5");
        System.out.println("Jane's cash on hand: $" + Jane.getCash());
        System.out.println("Chocolate Bar quantity: " + ChocolateBar.getQuantity());

        Pretzel.addQuantity(12);
        System.out.println("\nProcess: 6");
        System.out.println("Pretzel quantity: " + Pretzel.getQuantity());

        Bob.buy(Pretzel.getCost(3));
        Pretzel.addQuantity(-3);
        System.out.println("\nProcess: 7");
        System.out.println("Bob's cash on hand: $" + Bob.getCash());
        System.out.println("Pretzel quantity: " + Pretzel.getQuantity());
    }
}

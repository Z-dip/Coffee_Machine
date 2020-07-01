package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        int i = 1;
        String back = "back";
        while (i == 1) {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = scanner.nextLine();
        switch (action) {
            case "exit":
            i = 0;
            break;
            case "buy":
                System.out.print("What do you want to buy?");
                System.out.println(" 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                    if ( action == "exit") {
                        break;
                    }
                    if (water < 250) {
                            System.out.println("Sorry, not enough water!");
                            break;
                            
                            }
                        else if (beans < 16) {
                            System.out.println("Sorry, not enough coffee beans!");
                            break;
                            }
                        else if  (cups - 1 == 0 ) {
                            System.out.println("Sorry, not enough disposable cups!");
                            break;
                            }
                        else {
                            System.out.println("I have enough resources, making you a coffee!");
                            water = water - 250;
                            milk = milk;
                            beans = beans - 16;
                            cups = cups - 1;
                            money = money + 4;
                        }
                        break;

                    case "2":
                        if (action == "exit") {
                            break;
                        }
                        if (water < 350) {
                            System.out.println("Sorry, not enough water!");
                            break;
                            }
                        else if (milk < 75) {
                            System.out.println("Sorry, not enough milk!");
                            break;
                            }    
                        else if (beans < 20) {
                            System.out.println("Sorry, not enough coffee beans!");
                            break;
                            }
                        else if  (cups == 0 ) {
                            System.out.println("Sorry, not enough disposable cups!");
                            i = i - i;
                            break;
                            }
                        else {
                            System.out.println("I have enough resources, making you a coffee!");
                            water = water - 350;
                            milk = milk - 75;
                            beans = beans - 20;
                            cups = cups - 1;
                            money = money + 7;
                        }
                        break;

                    case "3":
                        if (action == "exit") {
                            break;
                        }
                        if (water < 200) {
                            System.out.println("Sorry, not enough water!");
                            break;
                            }
                        else if (milk < 100) {
                            System.out.println("Sorry, not enough milk!");
                            break;
                            }    
                        else if (beans < 12) {
                            System.out.println("Sorry, not enough coffee beans!");
                            break;
                            }
                        else if  (cups - 1 == 0 ) {
                            System.out.println("Sorry, not enough disposable cups!");
                            i = i - i;
                            break;
                            }
                        else {
                            System.out.println("I have enough resources, making you a coffee!");
                            water = water - 200;
                            milk = milk - 100;
                            beans = beans - 12;
                            cups = cups - 1;
                            money = money + 6;
                        }   
                    case "back" :
                        break;
                }
                break;



            case "fill":
                System.out.println("Write how many ml of water do you want to add:");
                int addWater = scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                int addMilk = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:");
                int addBeans = scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                int addCups = scanner.nextInt();
                water = addWater + water;
                milk = addMilk + milk;
                beans = addBeans + beans;
                cups = addCups + cups;
                break;

            case "take":
                System.out.println("I gave you $" + money);
                money = 0;
                break;
                
            case "remaining":
                System.out.println("The coffee machine has:");
                System.out.println(water + " of water");
                System.out.println(milk + " of milk");
                System.out.println(beans + " of coffee beans");
                System.out.println(cups + " of disposable cups");
                System.out.println("$" + money + " of money");
                break;

            }
        }
    }
} 


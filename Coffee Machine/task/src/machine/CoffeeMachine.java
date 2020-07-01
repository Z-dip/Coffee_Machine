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
       // System.out.println("The coffee machine has:");
       // System.out.println(water + " of water" + "\n" + milk + " of milk" + "\n" + beans + " of coffee beans");
       // System.out.println(cups + " of disposable cups" + "\n" + money + " of money");
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
                           // i = i - i;
                           // return i;
                           // return water;
                            break;
                            
                            }
                        else if (beans < 16) {
                            System.out.println("Sorry, not enough coffee beans!");
                           // i = i - i;
                           // return i;
                           // return beans;
                            break;
                            }
                        else if  (cups - 1 == 0 ) {
                            System.out.println("Sorry, not enough disposable cups!");
                          //  i = i - i;
                          //  return i;
                           // return cups;
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
                        //System.out.println("The coffee machine has:");
                        //System.out.println(water - 250 + " of water" + "\n" + milk + " of milk" + "\n" + (beans - 16) + " of coffee beans");
                       // System.out.println(cups - 1 + " of disposable cups" + "\n" + money + 4 + " of money");
                       // water = water - 250;
                       // beans = beans - 16;
                       // cups = cups - 1;
                       // money = money + 4;
                        break;

                    case "2":
                        if (action == "exit") {
                            break;
                        }
                        if (water < 350) {
                            System.out.println("Sorry, not enough water!");
                           // i = i - i;
                          //  return i;
                          //  return water;
                            break;
                            }
                        else if (milk < 75) {
                            System.out.println("Sorry, not enough milk!");
                          //  i = i - i;
                          //  return i;
                          //  return milk;
                            break;
                            }    
                        else if (beans < 20) {
                            System.out.println("Sorry, not enough coffee beans!");
                           // i = i - i;
                           // return i;
                          //  return beans;
                            break;
                            }
                        else if  (cups == 0 ) {
                            System.out.println("Sorry, not enough disposable cups!");
                            i = i - i;
                           // return i;
                          //  return cups;
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
                       // System.out.println("The coffee machine has:");
                      //  System.out.println(water - 350 + " of water" + "\n" + (milk - 75) + " of milk" + "\n" + (beans - 20) + " of coffee beans");
                       // System.out.println(cups - 1 + " of disposable cups" + "\n" + (money + 7) + " of money");
                       // water = water - 350;
                       // milk = milk - 75;
                       // beans = beans - 20;
                       // cups = cups - 1;
                       // money = money + 7;
                        break;

                    case "3":
                        if (action == "exit") {
                            break;
                        }
                        if (water < 200) {
                            System.out.println("Sorry, not enough water!");
                           // i = i - i;
                           // return i;
                          //  return water;
                            break;
                            }
                        else if (milk < 100) {
                            System.out.println("Sorry, not enough milk!");
                          //  i = i - i;
                          //  return i;
                          //  return milk;
                            break;
                            }    
                        else if (beans < 12) {
                            System.out.println("Sorry, not enough coffee beans!");
                          //  i = i - i;
                          //  return i;
                          //  return beans;
                            break;
                            }
                        else if  (cups - 1 == 0 ) {
                            System.out.println("Sorry, not enough disposable cups!");
                            i = i - i;
                           // return i;
                           // return cups;
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
                       // System.out.println("The coffee machine has:");
                       // System.out.println(water - 200 + " of water" + "\n" + (milk - 75) + " of milk" + "\n" + (beans - 20) + " of coffee beans");
                      //  System.out.println(cups - 1 + " of disposable cups" + "\n" + money + 6 + " of money");
                      //  water = water - 200;
                      //  milk = milk - 100;
                      //  beans = beans - 12;
                       // cups = cups - 1;
                       // money = money + 6;
                        
                    }
               // return water; return milk; return beans; return cups; return money; return i;
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
              //  System.out.println("The coffee machine has:");
               // System.out.println(addWater + water + " of water");
               // System.out.println(addMilk + milk + " of milk");
              //  System.out.println(addBeans + beans + " of coffee beans");
              //  System.out.println(addCups + cups + " of disposable cups");
              //  System.out.println(money);
                water = addWater + water;
                milk = addMilk + milk;
                beans = addBeans + beans;
                cups = addCups + cups;
               // return water; return milk; return beans; return cups;
                break;

            case "take":
                System.out.println("I gave you $" + money);
               // System.out.println(water + " of water" + "\n" + milk + " of milk" + "\n" + beans + " of coffee beans");
               // System.out.println(cups + " of disposable cups" + "\n" + money + " of money");
                money = 0;
                break;
                
            case "remaining":
                System.out.println("The coffee machine has:");
                System.out.println(water + " of water");
                System.out.println(milk + " of milk");
                System.out.println(beans + " of coffee beans");
                System.out.println(cups + " of disposable cups");
               // System.out.println("Write action (buy, fill, take, remaining, exit"):
                System.out.println("$" + money + " of money");
                break;
            
            //case "exit": // if exit break outside of this???
              //  i = i - i;
               // return i;
               // break;

            }
        }
    }
} 


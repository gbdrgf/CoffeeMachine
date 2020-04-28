package machine;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int water = 400;
        int milk = 540;
        int coffee = 120;
        int cup = 9;
        int money = 550;
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            switch (action) {
                case "buy":
                    System.out.println(" ");
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    String c = scanner.next();
                    switch (c) {
                        case "1":
                            if (water >= 250 && coffee >= 16 && cup >= 1) {
                                water -= 250;
                                coffee -= 16;
                                cup -= 1;
                                money += 4;
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println(" ");
                                break;
                            } else if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                                System.out.println(" ");
                                break;
                            } else if (coffee < 16) {
                                System.out.println("Sorry, not enough coffee!");
                                System.out.println(" ");
                                break;
                            } else if (cup < 1) {
                                System.out.println("Sorry, not enough cups!");
                                System.out.println(" ");
                                break;
                            }
                        case "2":
                            if (water >= 350 && milk >= 75 && coffee >= 20 && cup >= 1) {
                                water -= 350;
                                milk -= 75;
                                coffee -= 20;
                                cup -= 1;
                                money += 7;
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println(" ");
                                break;
                            } else if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                                System.out.println(" ");
                                break;
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                                System.out.println(" ");
                                break;
                            } else if (coffee < 20) {
                                System.out.println("Sorry, not enough coffee!");
                                System.out.println(" ");
                                break;
                            } else if (cup < 1) {
                                System.out.println("Sorry, not enough cups!");
                                System.out.println(" ");
                                break;
                            }
                        case "3":
                            if (water >= 200 && milk >= 100 && coffee >= 12 && cup >= 1) {
                                water -= 200;
                                milk -= 100;
                                coffee -= 12;
                                cup -= 1;
                                money += 6;
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println(" ");
                                break;
                            } else if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                                System.out.println(" ");
                                break;
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                                System.out.println(" ");
                                break;
                            } else if (coffee < 12) {
                                System.out.println("Sorry, not enough coffee!");
                                System.out.println(" ");
                                break;
                            } else if (cup < 1) {
                                System.out.println("Sorry, not enough cups!");
                                System.out.println(" ");
                                break;
                            }
                        default:
                            break;
                    }
                    break;
                case "fill":
                    System.out.println(" ");
                    System.out.println("Write how many ml of water do you want to add:");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add: ");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    coffee += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    cup += scanner.nextInt();
                    System.out.println(" ");
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    System.out.println(" ");
                    break;
                case "remaining":
                    System.out.println(" ");
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(coffee + " of coffee beans");
                    System.out.println(cup + " of disposable cups");
                    System.out.println(money + " of money");
                    System.out.println(" ");
                    break;
                case "exit":
                    System.out.println(" ");
                    work = false;
                    break;
                default:
                    break;
            }
        }
    }
}

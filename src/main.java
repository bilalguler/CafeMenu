// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int choise, control = 0, foodChoise, drinkChoise, desertChoise, cnt = 5;

        double cheeseSandwich = 3.20;
        double baconSandwich = 3.50;
        double hamSamdwich = 3.30;
        double tunaSandwich = 3.40;

        double teaPrice = 1.50;
        double coffeePrice = 1.70;
        double cappuccinoPrice = 2.00;
        double hotChocolatePrice = 1.60;

        double cupcakePrice = 1.10;
        double biscuitPrice = 0.90;
        double chocolateCakePrice = 1.60;
        double iceCreamTubPrice = 1.90;

        double price = 0.00;

        String foodMenu = "empty";
        String drinkMenu = "empty";
        String desertMenu = "empty";

        System.out.println("Welcome to Guler Cafe.");

        while (control == 0) {

            while (cnt == 5) {

                System.out.println("What would you like to eat or drink?" +
                        "\n\t1) Food\n\t2) Drinks\n\t3) Deserts\n\t");
                choise = scan.nextInt();
                System.out.println("===========================================");

                switch (choise){
                    case 1:
                        System.out.println("Welcome to food menu.");
                        System.out.println("\t1) Cheese Sandwich----------" + cheeseSandwich + "£" +
                                "\n\t2) Bacon Sandwich-----------" + baconSandwich + "£" +
                                "\n\t3) Ham Sandwich-------------" + hamSamdwich + "£" +
                                "\n\t4) Tuna Sandwich------------" + tunaSandwich + "£");
                        System.out.println("What would you like to eat? Please choose.");
                        foodChoise = scan.nextInt();
                        System.out.println("===========================================");
                        if (foodChoise < 1 || foodChoise > 4) {
                            System.out.println("Please make a valid choice.");
                            System.out.println("===========================================");
                            System.out.println("What would you like to eat? Please choose.");
                            foodChoise = scan.nextInt();
                            System.out.println("===========================================");
                        }
                        if (foodChoise == 1) {
                            price += cheeseSandwich;
                            foodMenu = "Cheese Sandwich";
                        }
                        else if (foodChoise == 2) {
                            price += baconSandwich;
                            foodMenu = "Bacon Sandwich";
                        }
                        else if (foodChoise == 3) {
                            price += hamSamdwich;
                            foodMenu = "Ham Sandwich";
                        }
                        else {
                            price += tunaSandwich;
                            foodMenu = "Tuna Sandwich";
                        }

                        System.out.println("Press number 5 if you want to continue.");
                        cnt = scan.nextInt();
                        System.out.println("===========================================");
                        break;
                    case 2:
                        System.out.println("Welcome to food menu.");
                        System.out.println("\t1) Tea----------------------" + teaPrice + "£" +
                                "\n\t2) Coffee-------------------" + coffeePrice + "£" +
                                "\n\t3) Cappucino----------------" + cappuccinoPrice + "£" +
                                "\n\t4) Hot Chocolate------------" + hotChocolatePrice + "£");
                        System.out.println("What would you like to drink? Please choose.");
                        drinkChoise = scan.nextInt();
                        System.out.println("===========================================");
                        if (drinkChoise < 1 || drinkChoise > 4) {
                            System.out.println("Please make a valid choice.");
                            System.out.println("===========================================");
                            System.out.println("What would you like to eat? Please choose.");
                            drinkChoise = scan.nextInt();
                            System.out.println("===========================================");
                        }
                        if (drinkChoise == 1) {
                            price += teaPrice;
                            drinkMenu = "Tea";
                        }
                        else if (drinkChoise == 2) {
                            price += coffeePrice;
                            drinkMenu = "Coffee";
                        }
                        else if (drinkChoise == 3) {
                            price += cappuccinoPrice;
                            drinkMenu = "Cappucino";
                        }
                        else {
                            price += hotChocolatePrice;
                            drinkMenu = "Hot Chocolate";
                        }
                        System.out.println("Press number 5 if you want to continue.");
                        cnt = scan.nextInt();
                        System.out.println("===========================================");
                        break;
                    case 3:
                        System.out.println("Welcome to desert menu.");
                        System.out.println("\t1) Cupcake------------------" + cupcakePrice + "£" +
                                "\n\t2) Biscuit------------------" + biscuitPrice + "£" +
                                "\n\t3) Chocolate Cake-----------" + chocolateCakePrice + "£" +
                                "\n\t4) Ice Cream Tub------------" + iceCreamTubPrice + "£");
                        System.out.println("What would you like to eat? Please choose.");
                        desertChoise = scan.nextInt();
                        System.out.println("===========================================");
                        if (desertChoise < 1 || desertChoise > 4) {
                            System.out.println("Please make a valid choice.");
                            System.out.println("===========================================");
                            System.out.println("What would you like to eat? Please choose.");
                            desertChoise = scan.nextInt();
                            System.out.println("===========================================");
                        }
                        if (desertChoise == 1) {
                            price += cupcakePrice;
                            desertMenu = "Cupcake";
                        }
                        else if (desertChoise == 2) {
                            price += biscuitPrice;
                            desertMenu = "Biscuit";
                        }
                        else if (desertChoise == 3) {
                            price += chocolateCakePrice;
                            desertMenu = "Chocolate Cake";
                        }
                        else {
                            price += iceCreamTubPrice;
                            desertMenu = "Ice Cream Tub";
                        }
                        System.out.println("Press number 5 if you want to continue.");
                        cnt = scan.nextInt();
                        System.out.println("===========================================");
                        break;
                }
            }
            System.out.println("Food and drinks of your choice:\n\t" + foodMenu + "\n\t" + drinkMenu + "\n\t" + desertMenu);
            System.out.println("Total Price: " + price);
            System.out.println("===========================================");
            System.out.println("Press button 1 to exit.");
            control = scan.nextInt();
            System.out.println("===========================================");
        }
        System.out.println("Exited the menu. Thanks");
    }
}
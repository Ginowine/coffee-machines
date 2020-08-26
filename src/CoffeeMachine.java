
import java.util.Scanner;

public class CoffeeMachine {

    private static int totalAmtOfWater = 400;
    private static int totalAmtOfMilk = 540;
    private static int totalAmtOfCoffeeBeans = 120;
    private static int totalAmtOfCups = 9;
    private static int totalAmtOfMoney = 550;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String inputBuy = "buy";
        String inputFill = "fill";
        String inputTake = "take";
        String input;

        System.out.println("The coffee machine has:");
        System.out.println(totalAmtOfWater + " of water");
        System.out.println(totalAmtOfMilk + " of milk");
        System.out.println(totalAmtOfCoffeeBeans + " of coffee beans");
        System.out.println(totalAmtOfCups + " of disposable cups");
        System.out.println(totalAmtOfMoney + " of money");

        System.out.println("");

        System.out.println("write action (buy, fill, take): " );
        input = scanner.next();

        if (input.equals(inputBuy)){
            buy();
        }else if (input.equals(inputFill)){
            fill();
        }else if (input.equals(inputTake)){
            take();
        }else {
            System.out.println("enter buy, fill, or take: ");
        }
    }

    public static void buy(){

        System.out.println("what do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int kindOfCoffee;kindOfCoffee = scanner.nextInt();

        System.out.println("");

        switch (kindOfCoffee){
            case 1:
                espresso();
                break;
            case 2:
                latte();
                break;
            case 3:
                cappuccino();
                break;
            default:
                System.out.println("please choose 1 for espresso, 2 for latte, 3 for cappuccino");
        }
    }

    public static void fill(){

        System.out.println("Write how many ml of water do you want to add");
        int amtOfWaterToAdd = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int amtOfMilkToAdd = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int amtOfCoffeeBeansToAdd = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int amtOfCupsToAdd = scanner.nextInt();

        System.out.println("");

        totalAmtOfWater += amtOfWaterToAdd;
        totalAmtOfMilk += amtOfMilkToAdd;
        totalAmtOfCoffeeBeans += amtOfCoffeeBeansToAdd;
        totalAmtOfCups += amtOfCupsToAdd;

        System.out.println("The coffee machine has:");

        System.out.println(totalAmtOfWater + " of water");
        System.out.println(totalAmtOfMilk + " of milk");
        System.out.println(totalAmtOfCoffeeBeans + " of coffee beans");
        System.out.println(totalAmtOfCups + " of disposable cups");
        System.out.println(totalAmtOfMoney + " of money");
    }

    public static void take(){

        System.out.println("How much do you want?");
        int requestedAmount = scanner.nextInt();
        totalAmtOfMoney -= requestedAmount;

        System.out.println("I gave you " + "$" + requestedAmount);
        System.out.println("");

        System.out.println(totalAmtOfWater + " of water");
        System.out.println(totalAmtOfMilk + " of milk");
        System.out.println(totalAmtOfCoffeeBeans + " of coffee beans");
        System.out.println(totalAmtOfCups + " of disposable cups");
        System.out.println(totalAmtOfMoney + " of money");
    }


    public static void espresso(){
        totalAmtOfWater -= 250;
        totalAmtOfCoffeeBeans -= 16;
        totalAmtOfCups -= 1;
        totalAmtOfMoney += 4;

        System.out.println("The coffee machine has:");

        System.out.println(totalAmtOfWater + " of water");
        System.out.println(totalAmtOfMilk + " of milk");
        System.out.println(totalAmtOfCoffeeBeans + " of coffee beans");
        System.out.println(totalAmtOfCups + " of disposable cups");
        System.out.println(totalAmtOfMoney + " of money");

    }

    public static void latte(){
        totalAmtOfWater -= 350;
        totalAmtOfMilk -= 75;
        totalAmtOfCoffeeBeans -= 20;
        totalAmtOfCups -= 1;
        totalAmtOfMoney += 7;

        System.out.println("The coffee machine has:");

        System.out.println(totalAmtOfWater + " of water");
        System.out.println(totalAmtOfMilk + " of milk");
        System.out.println(totalAmtOfCoffeeBeans + " of coffee beans");
        System.out.println(totalAmtOfCups + " of disposable cups");
        System.out.println(totalAmtOfMoney + " of money");
    }

    public static void cappuccino(){
        totalAmtOfWater -= 200;
        totalAmtOfMilk -= 100;
        totalAmtOfCoffeeBeans -= 12;
        totalAmtOfCups -= 1;
        totalAmtOfMoney += 6;

        System.out.println("The coffee machine has:");

        System.out.println(totalAmtOfWater + " of water");
        System.out.println(totalAmtOfMilk + " of milk");
        System.out.println(totalAmtOfCoffeeBeans + " of coffee beans");
        System.out.println(totalAmtOfCups + " of disposable cups");
        System.out.println(totalAmtOfMoney + " of money");
    }

}


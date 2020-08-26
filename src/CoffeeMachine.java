
import java.util.Scanner;

public class CoffeeMachine {

    static int totalAmtOfWater = 400;
    static int totalAmtOfMilk = 540;
    static int totalAmtOfCoffeeBeans = 120;
    static int totalAmtOfCups = 9;
    static int totalAmtOfMoney = 550;

    static String inputBuy = "buy";
    static String inputFill = "fill";
    static String inputTake = "take";
    static String input;
    static int kindOfCoffee;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

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

//        water /= 200;
//        milk /= 50;
//        beans /= 15;
//
//        int min = Math.min(water, milk);
//        min = Math.min(beans, min);
//
//        if (n == min) {
//            System.out.println("Yes, I can make that amount of coffee");
//        } else if (n < min) {
//            System.out.println("Yes, I can make that amount of coffee (and even " +
//                    (min - n) + " more than that)");
//        } else {
//            System.out.println("No, I can make only " + min + " cup(s) of coffee");
//        }
    }

    public static void buy(){

        System.out.println("what do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        kindOfCoffee = scanner.nextInt();

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

    }


    public static void espresso(){
        totalAmtOfWater -= 250;
        //totalAmtOfMilk;
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


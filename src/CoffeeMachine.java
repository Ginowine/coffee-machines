
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        int amtOfWater = 400;
        int amtOfMilk = 540;
        int amtOfCoffeeBeans = 120;
        int amtOfCups = 9;
        int amtOfMoney = 550;

        String inputBuy = "buy";
        String inputFill = "fill";
        String inputTake = "take";
        String input;
        int kindOfCoffee;

        Scanner scanner = new Scanner(System.in);

        System.out.println("The coffee machine has:");
        System.out.println(amtOfWater + " of water");
        System.out.println(amtOfMilk + " of milk");
        System.out.println(amtOfCoffeeBeans + " of coffee beans");
        System.out.println(amtOfCups + " of disposable cups");
        System.out.println(amtOfMoney + " of money");


        System.out.println("write action (buy, fill, take): " );
        input = scanner.next();

        System.out.println("what do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        kindOfCoffee = scanner.nextInt();

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

    public static void espresso(){

    }

    public static void latte(){

    }

    public static void cappuccino(){

    }

}


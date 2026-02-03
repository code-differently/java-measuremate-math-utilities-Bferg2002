import java.util.*;
public class TipTaxCalculator {

   //method that takes calculates the tax amount of a bill
   public static double calcTaxAmount (double percent, double billAmt){
       return billAmt * (percent / 100);
   }

   //method that calculates the tip amount of a bill
   public static double calcTipAmount (double percent, double billAmt){
       return billAmt * (percent / 100);
   }

   //method that calculates the total bill amount
   public static double calcRawTotalAmount (double tipPercent, double taxPercent ,double billAmt ){
       return billAmt + calcTaxAmount(taxPercent,billAmt) + calcTipAmount(tipPercent,billAmt);
    }

   //method that rounds the total bill amount
   public static long roundRawTotalAmount(double tipPercent, double taxPercent ,double billAmt){
       return Math.round(calcRawTotalAmount( tipPercent,  taxPercent , billAmt));
   }

   public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //scanner object called input that reads user input

       //this chunk of code prompts the user to enter in their bill information
        System.out.println("Enter bill amount: ");
        double billAmt = input.nextDouble();
        System.out.println("Enter tax rate (%): ");
        double taxRate = input.nextDouble();
        System.out.println("Enter tip amount (%): ");
        double tipAmt = input.nextDouble();

       //this chunk of code displays the bill results
       System.out.println("Bill amount: " + billAmt);
       System.out.println("Tip amount: " + calcTipAmount(tipAmt,billAmt));
       System.out.println("Tax amount: " + calcTaxAmount(taxRate,billAmt));
       System.out.println("Total (raw): " + calcRawTotalAmount(tipAmt,taxRate, billAmt));
       System.out.println("Total (rounded): " + roundRawTotalAmount(tipAmt,taxRate, billAmt));
       input.close(); //closes the scanner object
    }

}



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a new scanner object
        Scanner input = new Scanner (System.in);

        //Prompt the user to enter the item price
        System.out.printf("Please enter the item price: ");
        double originalPrice = input.nextDouble();

        //Prompt the user to enter the discount ratio
        System.out.printf("Please enter the discount ratio: ");
        double discountRatio = input.nextDouble();

        //Calcul for the price before tax
        double priceBeforeTax = originalPrice - (originalPrice*(discountRatio/100));

        //Display the result
        System.out.printf("%-12s: %f%n", "Original Price", originalPrice);
        System.out.printf("%-12s: %f%n", "Discount Ratio", discountRatio);
        System.out.printf("%-12s: %f%n", "Price Before Tax", priceBeforeTax);

        //Calcul the federal tax
        double federalTax = priceBeforeTax*0.05;

        //Calcul the provincial tax
        double provincialTax = priceBeforeTax*0.09975;

        //Calcul the final price
        double finalPrice = priceBeforeTax + federalTax + provincialTax;

        //Display result
        System.out.printf("%-12s: %f%n", "Federal Tax", federalTax);
        System.out.printf("%-12s: %f%n", "Provincial Tax", provincialTax);
        System.out.printf("%-12s: %f%n", "Final Price", finalPrice);
    }

}




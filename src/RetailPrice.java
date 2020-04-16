/*
Pseudocode:
import scanner
declare class
declare method
declare variables for cont, cost, retail, rate, scanner
initialize rate cont
declare do/while
prompt user to enter price
initialize retail
set condition for while
 */

import java.util.Scanner;

public class RetailPrice {
    public static void main(String[] args) {
        String cont;
        double cost, retail, rate;

        rate = 2.5;
        cont = "Please enter the wholesale price of a product." +
                "\nEnter 0 to exit.\n";

        do {
            System.out.println(cont);
            Scanner keybd = new Scanner(System.in);
            retail = keybd.nextDouble() * rate;
            System.out.printf("\nThe retail price is $%.2f.\n\n", retail);
        } while (retail != 0);
    }
}

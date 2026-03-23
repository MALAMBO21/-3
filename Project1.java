
package my.company.id.project1;

import java.util.Scanner;
public class Project1 {

    public static void main(String[] args) {
       
        //Compund Interest calculator
        
        Scanner scanner = new Scanner(System.in);
        
        double principal;
        double rate;
        int timesCompunded;
        int years;
        double amount;
               
        System.out.print("Enter the principal: ");
        principal =scanner.nextDouble();
        
        System.out.print("Enter the rate (in %): ");
        rate = scanner.nextDouble() / 100;
        
        System.out.print("Enter the times compunded per year: ");
        timesCompunded = scanner.nextInt();
        
        System.out.print("Enter the number of years of investment: ");
        years = scanner.nextInt();
        
        amount = principal * Math.pow(1 + rate / timesCompunded, timesCompunded * years);
        System.out.printf("Your amount after %d is R%.2f", years, amount);
                
                             
    scanner.close();
   }    
}    
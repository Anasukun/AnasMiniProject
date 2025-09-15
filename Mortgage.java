import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final byte Months_per_year = 12;
        final byte Percent = 100;
        
    // set principal
        
        System.out.print("Enter principal: ");
        int principal = sc.nextInt();
        
        //Set annual interest rate
        System.out.print("Enter annual interest rate: ");
        double annual_interest = sc.nextDouble();
        double percent_of_interest = annual_interest / Percent / Months_per_year;
        
        //Set period of years
        System.out.print("Enter period of years: ");
        byte period_of_years = sc.nextByte();

        // calculate mortgage
         double mortgage = (double)principal * percent_of_interest * Math.pow(annual_interest+1, period_of_years)
         / (Math.pow(annual_interest+1, period_of_years) - 1);
         String exchange = NumberFormat.getCurrencyInstance().format(mortgage);
         System.out.println("Mortgage: " + exchange);
         sc.close();

      

    
    
    }
}

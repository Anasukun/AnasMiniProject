import java.util.*;
public class CatDog{
    public static void main(String[] args) {
    
        // scanner
        Scanner input = new Scanner(System.in);


       System.out.println("=== CAT AND DOG BUZZER ===");
        System.out.print("Enter the number");
        int number = input.nextInt();

        if (number % 5 == 0)          
          System.out.println("Cat");
         
        else if (number % 3 == 0)
            System.out.println("Dog");
            else if (number % 3 == 0 && number % 5 == 0)
                System.out.println("CatDog");
                else 
                System.out.println(number);
                
                input.close();
                

            
        }


}

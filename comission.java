/*Ethan Covert
4/10/18
CSC 15 Ch. 5 Lab*/
import java.util.Scanner;
public class comission
{
   public static final double MAX_RATE = 25;
   public static void main(String[] arg)
   {
      Scanner kb = new Scanner(System.in);
      run(kb);
   }
   public static void run(Scanner kb) //This method determines if the user would like to run the program again or if it should end the loop.
   {
      boolean repeat = true;
      while(repeat)
      {
         saleAmount(kb);
         System.out.println("Do you want to use the App again? (yes/no)");
         String answer = kb.nextLine();
         while(!(answer.equalsIgnoreCase("yes")) || (answer.equalsIgnoreCase("no")))
         {
            System.out.print("enter yes or no ");
            answer = kb.nextLine();
            break;
         }
         if(answer.equalsIgnoreCase("no"))
         {
               repeat = false;
         }
      }        
                  
   }     
   public static void saleAmount(Scanner kb)// This method gets the values imputed by the user and first sends the inputed number
   {                                        // to getValidDouble to determine if it is a valid number. 
      double salesAmount = 0;
      double goal = getValidDouble(kb, "Enter a positive amount for comission goal that you want to get: ");
      double baseRate = getValidDouble(kb, "Enter a positive amount base rate for comission: ");
      double increment = getValidDouble(kb, "Enter a positive amount of percent increase for comission: "); 
      double interval = getValidDouble(kb, "Enter a positive amount for the sale interval that comission increases: ");
      double comission = 0;
      while(comission < goal)
      {
         comission = comission(salesAmount, baseRate, increment, interval);
         if(comission < goal)
          salesAmount = salesAmount + 0.1;
         
      }
      System.out.printf( "To get the %8.2f of comission, you need to have %8.2f of sale", goal, salesAmount);
      System.out.println();
   }
   public static double comission( double saleAmount, double baseRate, double increment, double interval) // This method computes all the information given and finds the commission. 
   {
      double total = 0;
      double rate = 0;
      double com = 0;
      double count = 0;
      double sale = saleAmount;
      while(sale > interval)
      {
         sale = sale - interval;
         count = count + increment;
      }
      rate = baseRate + count;
      if(rate > MAX_RATE)
      {
         rate = MAX_RATE;
      }   
      double max = rate;
      rate = rate - increment;
      while(rate > 0 && saleAmount > interval)
      {
         com = interval * rate/100;
         saleAmount = saleAmount - interval;
         rate = rate - increment;
         total = total + com;
      }
      if(saleAmount > 0)
         total = total + saleAmount *max/100;
      return total;     
   }
   public static double getValidDouble(Scanner kb, String prompt)// this method checks to see if the variable inputted by the user is a valid variable
   {                                                             // and prompts the user for an answer until the valid one is given.
      double value = -1;
      
      while (value < 0)
      {
         System.out.print(prompt);
         while(!kb.hasNextLine())
         {
            kb.nextDouble();
            System.out.print(prompt);
               
            
         }
         value = kb.nextDouble();
      }   
         return value;
   }
}                        
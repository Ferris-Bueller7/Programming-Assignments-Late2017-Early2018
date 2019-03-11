/*
Ethan Covert
CSC 15
3/6/18
*/
import java.util.*;
public class report
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      process(kb);
   }      
   public static void process(Scanner kb)
   {
      
      double totalHours = 0;
      double totalIncome = 0;
      String title = String.format("%10s%10s%10s%10s%15s%15s%20s%15s\n","Clients","lawyer","hours","Fee","%Discount","Reg Hours","Discounted Hours","Total Fee");
      String report = title;
      frame();
      description();
      System.out.println();
      System.out.println();
      System.out.println();
      frame();
      System.out.print("How many clients do you have? ");
      int clients = kb.nextInt();
      for(int i = 1; i <= clients; i++)
      {
         kb.nextLine();
         System.out.print("Enter the client's name: ");
         String client = kb.nextLine();
         System.out.print("Enter the lawyer's name: ");
         String lawyer = kb.nextLine();
         System.out.print("Enter the hours: ");
         double hours = kb.nextDouble();
         System.out.print("Enter the base hours: ");
         double minHours = kb.nextDouble();
         System.out.print("Enter the fee for the first " + Math.min(hours, minHours) + " hours: ");
         double baseHoursPrice = kb.nextDouble();
         System.out.print("Enter the percentage fee: ");
         double percent = kb.nextDouble();
         seperate();
         double totalFee = getFee(hours, baseHoursPrice, percent, minHours);
         double discountedPrice = getDiscountedHours(hours, percent);
         double discountedHours = getDiscountedHours(hours, minHours);
         totalIncome = totalIncome + totalFee;
         totalHours = totalHours + (Math.min(hours, minHours) + discountedPrice);
         String s = String.format("%10s%10s%10.2f%10.2f%15.2f%15.2f%20.2f%15.2f\n" ,client,lawyer,hours,baseHoursPrice,percent,Math.min(hours, minHours),discountedHours,totalIncome);  
         report = report + s; 
      }
      System.out.println(report);
      String title2 = String.format("%1s%10s\n","Total Hours", "Total Income");
      String total2 = String.format("%15.2f%15.2f/n", totalHours, totalIncome);
      
   }   
   public static void description()
   {
      String programOverview = " ";
      programOverview =  "This program generates a summary report for the Best Law Firm \n";
      programOverview = programOverview + "Clients are charged basd on the number of hours.\n";
      programOverview = programOverview + "Depending on the assigned lawyer, clients get an";
      programOverview = programOverview + " hourly discount after certain number of hours.\n";
      programOverview = programOverview + "The provided discount is offered by each individual ";
      programOverview = programOverview + "lawyer and it could vary form one lawyer to another.";
      System.out.print(programOverview);   
   }
   public static void frame()//This produces the Stars
   {
      for(int i =0; i <= 150; i++)
      {
         System.out.print("*");
      }   
      System.out.println();
   }
   public static String seperate()
   {
         for(int x = 1; x <= 100; x++)
         {
            System.out.print("-");
         }   
         System.out.println();
         return " ";
   }
   
   public static double getFee(double hours, double baseHoursPrice, double percent, double minHours)//This gets the fee and 
   {
      double Fee = Math.min(hours,minHours) * baseHoursPrice +Math.max(hours-minHours, 0) * (percent/100 * baseHoursPrice);
      return Fee;
  
   }
   public static double getDiscountedHours(double hours, double minHours)
   {
      double discountedHours = Math.max(hours - minHours, 0);
      return discountedHours;
      
   
   } 
}
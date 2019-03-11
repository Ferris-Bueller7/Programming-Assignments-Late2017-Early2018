/*
Ethan Covert
Ch. 4 Lab
3/18/18
*/
import java.util.Scanner;
public class DaysInTheMonth
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      runProgram(console);
   }
   public static void runProgram(Scanner console)// This controls the entire program choosing which methods to call depending on the users answers
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("Choose a number from 1-12: ");
      int month = kb.nextInt();
      if(month == 2)
      {
         System.out.print("The month of February has " + getNumDaysFeb(console) + " days ");
      }   
      else if((month == 1)||(month == 2)||(month == 3)||(month == 4)||(month == 5)||(month == 6)||(month == 7)||(month == 8)||(month == 9)||(month == 10)||(month == 11)||(month == 12))
      {   
         System.out.print("The month of " + getMonthName(month) + " has " + getNumDays(month, console) + " days in it");
      }
      else
      {
         System.out.print("Invalid month");
      }      
      
   }
   public static String getMonthName(int monthNum)//This determines which month the user wants using the number the user chooses
   {
      String theMonth = "";
      switch(monthNum)
      {
         case 1: theMonth = "January";
         break;
         case 2: theMonth = "February";
         break;
         case 3: theMonth = "March";
         break;
         case 4: theMonth = "April";
         break;
         case 5: theMonth = "May";
         break;
         case 6: theMonth = "June";
         break;
         case 7: theMonth = "July";
         break;
         case 8: theMonth = "August";
         break;
         case 9: theMonth = "September";
         break;
         case 10: theMonth = "October";
         break;
         case 11: theMonth = "November";
         break;
         case 12: theMonth = "December";
         break;
         default: theMonth = "incorrect month choice ";
      }
      return theMonth;
   }   
   public static int getNumDays(int monthNu, Scanner console) //determines which months have which number of days
   {
      int numDays = 0;
      switch(monthNu)
      {
         case 1: case 3: case 5: case 7: case 8: case 10: case 12: numDays = 31;
         break;
         case 4: case 6: case 9: case 11: numDays = 30;
         break;
         default : numDays = 0;
      }
      return numDays;    
   }
   public static int getNumDaysFeb(Scanner console) //calculates whether that year choosen was a leap year or regular year
   {
      int numDays = 0;
      System.out.print(" What year are you intrested in?");
      int year = console.nextInt();
      if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
      {
         numDays = 29;
      }   
      else
      {
         numDays = 28;
      }
      return numDays;        
   }
}
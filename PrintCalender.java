import java.util.Scanner;
public class PrintCalender
{
   public static void main(String[] args)
   {
      process();
   }
   public static void process()
   {
      Scanner kb = new Scanner(System.in);
      System.out.println("How many times do you want to run?");
      int choice = kb.nextInt();
      kb.nextLine();
      for (int i = 1; i <= choice; i++)
      {
         System.out.println("Choose one of the following options: \n 1. Year\n 2. Month");
         System.out.println("Enter choice here -->");
         String decision = kb.nextLine();
         if(decision.equalsIgnoreCase("year"))
         {
            System.out.println("Enter a valid year after 1700");
            int year = kb.nextInt();
            int month = 0;
            for(int x = 1; x <= 12; x++)
            {
               printMonth(year, x);
            }   
         }
         else if(decision.equalsIgnoreCase("month"))
         {
            System.out.println("Enter a valid year after 1700");
            int year = kb.nextInt();
            System.out.println("Enter the month number that you want:");
            int month = kb.nextInt();
               printMonth(year, month);   
         }   
         else
         {
            System.out.print("invalid choice");
         } 
      }   
   }
   public static void printMonth(int year, int month)
   {
      printMonthTitle(year, month);
      printMonthBody(year, month);
   }
   public static void printMonthTitle(int year, int month)
   {
      //for(int i = 1; i <= month; i++)
      //{
         System.out.println("           " + getMonthName(month) + " " + year);
      //}
      for(int d = 1; d <= 36; d++)
      {
         System.out.print("-");
      }
      System.out.println(); 
      String title = String.format("%4s %4s %5s %4s %6s %4s %4s","Sun","Mon","Tues","Wed","Thurs","Fri","Sat");
      System.out.println(title);      
   }
   public static void printMonthBody(int year, int month)
   {
      int startDay = getStartDay(year, month);
      int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
      for(int spaces = 0; spaces <= startDay; spaces++)
      {
         System.out.print(" ");
      }
      for(int spaces = 1; spaces < numberOfDaysInMonth; spaces++)
      {
         if(spaces < 10)
         {
            System.out.print(" " + spaces);
         }
         else
         {
            System.out.print(" " + spaces);
         }
         if((spaces + startDay) % 7 ==0)
         {
            System.out.println();
         }
       }
       System.out.println();                   
   }
   public static void print(int startDay, int year, int month)
   {
      for (int i = 1; i <= startDay; i++)
      {
         System.out.print("    ");
      }
      for (int i = 1; i <= getNumberOfDaysInMonth(year, month); i++)
      {
         System.out.printf("%-4d", i);
         if ((i + startDay) % 7 == 0)
         {
            System.out.println();
         }
         if (month == 11)
         {
            int thanksGiving = thanks(startDay);
            System.out.println("\n**Thanksgiving day is on the " + thanksGiving + "th");
         }   
      }
   }   
   public static int thanks(int startDay)
   {
      return 0;
   }
   public static String getMonthName(int month)   
   {
      String theMonth = "";
      switch(month)
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
         default: theMonth = "Invalid choice";
      }   
      return theMonth;
   }
   public static int getStartDay(int year, int month)
   {
      int start = getTotalNumberOfDays(year,month);
      start = start + 3;
      return start % 7;
   }
   public static int getTotalNumberOfDays(int year, int month)
   {
      int days = 0;
      for(int i = 1700; i <= year - 1; i++)
      {
         if(isLeapYear(i))
         {
            days = days + 366;
         }
         else
         {
            days = days + 365;
         }       
      }
      for(int i = 1; i <= month; i++)
      {
         getNumberOfDaysInMonth(year,i);
      }
      return days;       
         
         
/*for(int m = 1; m <= 12; m++)
         {
            getNumberOfDaysInMonth(year, month);
         }   
      for(int w = 1; w <= month; w++)
      {
         days = getNumberOfDaysInMonth(year,month) +       
      }
      }
      return days;*/
   }
   public static int getNumberOfDaysInMonth(int year, int month)
   {
      int numDays = 0;
      switch(month)
      {
         case 1: case 3: case 5: case 7: case 8: case 10: case 12: numDays = 31;
         break;
         case 4: case 6: case 9: case 11: numDays = 30;
         break;
         case 2:  if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                  {
                     numDays = 29;
                  }
                  else
                  {
                     numDays = 28;
                  }
         break;                
         default : numDays = 0;
      }   
      return numDays;
      
   }
   public static boolean isLeapYear(int year)
   {
      boolean trueFalse = true;
      if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
      {
         trueFalse = true;
      }
      else
      {
         trueFalse = false;
      }      
      return trueFalse;
   }
}                     
          
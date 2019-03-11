/*Ethan Covert
  CSC 15
*/  
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class ATMDriver
{
   public static void main(String[] args) throws IOException
   {
      run();
   }
   public static void run() throws FileNotFoundException
   {
      Scanner kb = new Scanner(System.in);
      display();
      Account[] people = new Account[10];
      boolean morePeople = true;
      description();
      Scanner fReader = getFileName(kb);
      populate(people, fReader); 
      do
      {
         boolean moreTransactions = true;
         int index = getId(kb , people);
         while(moreTransactions && morePeople)
         {
            display();
            int choice = getChoice(kb);
            switch(choice)
            {
               case 1: checkBalance(index, people); 
                  break;
               case 2: withdraw(index, people, kb);
                  break;
               case 3: deposit(index, people, kb);
                  break;
               case 4: moreTransactions = false;
                       System.out.print("Is there someone line behind you? (yes/no) ");
                       String result = kb.next();
                       System.out.println();
                       while (!(result.contains("yes") || result.contains("no")))
                       {
                           System.out.print("Invalid. Please enter \"yes\" or \"no\": ");
                           result = kb.next();
                       }
                       if (result.equalsIgnoreCase("yes"))
                       {
                           morePeople = true;                  
                       }
                       else 
                       { 
                           morePeople = false;
                           System.out.println("\nThank you for using this ATM Machine. \nGoodbye!");
                       } 

                                                      
             }          
         }
      }
      while(morePeople);
   }
   public static void display()
   {
      System.out.println("Main menu\n" + "1: Check Balance\n" + "2: Withdraw\n" + "3: Deposit\n" + "4: Exit\n" + "Enter Choice:");
      
   }
   public static void populate(Account[] a , Scanner fReader)
   {
      for( int i = 0; i < a.length; i++)
      {
         String name = "";
         String first = fReader.next();
         String last = fReader.next();
         int Id = fReader.nextInt();
         double balance = fReader.nextDouble();
         name = first + " " + last;
         a[i] = new Account(Id, balance, name);
      }
   }
   public static int getId (Scanner kb, Account [] accounts) 
   {
      System.out.print("Enter your id: ");
      int id = kb.nextInt();
      int index = searchId(id, accounts);
      while (index == -1)
      {
         System.out.print("Invalid ID. Enter your ID: ");
         id = kb.nextInt();
         index = searchId(id, accounts);         
      } 
      return index;  
   }

   
   
   
   static int searchId(int Id, Account[] accounts)
   {
      int result = -1;
      for(int i = 0; i < accounts.length; i++)
      {
         if(Id == accounts[i].getId())
         {
            result = i;
         }
      }
      return result;    
    
   }
   public static void description()
   {
      String description = "This program will simulate an ATM machine. \n";
      description = (description + "A menu will display and the user may choose what to do based on options displayed.");
      System.out.println(description);
      System.out.println();
   }
   public static void withdraw(int index, Account[] accounts, Scanner kb)
   {
      double amount = getValidInput(kb,"Withdraw");
      accounts[index].withdraw(amount);
   }   
   public static void deposit(int index, Account[] accounts, Scanner kb)
   {
      double amount = getValidInput(kb, "deposit");
      accounts[index].deposit(amount);
   }
   public static void checkBalance(int index, Account[] accounts)
   {
      System.out.print(accounts[index].getBalance());   
   }
   public static int getChoice(Scanner kb)
   { 
      System.out.print("Enter a choice: ");
      int choice = kb.nextInt();
      while(!(choice > 0 && choice <= 5))
      {
         System.out.println("Choice not valid. Try again.");
         display();
         System.out.print("Enter a choice: ");
         choice = kb.nextInt();
      }
      return choice;          
       
   }
   public static Scanner getFileName(Scanner kb) throws FileNotFoundException
   {
      System.out.print("Enter the file name: ");
      String name = kb.next();
      File fName = new File(name);
      while (!fName.exists())
      {
         System.out.print("File not found. Enter a vaid file name: ");
         name = kb.next();
         fName = new File(name);
      }
      Scanner fReader = new Scanner(fName);
      return fReader;
   }
   public static double getValidInput(Scanner kb, String type)
   {
      System.out.printf("Enter a positive amount to %s: ", type);
      double value = kb.nextDouble();
      while (value < 0)
      {
         System.out.print("Value invlaid. Enter a valid amount: ");
         value = kb.nextDouble();
      }
      return value;
    }
}

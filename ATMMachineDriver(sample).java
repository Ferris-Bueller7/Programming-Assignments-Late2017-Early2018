/*
Le Doan
CSC 15; Project #4
Professor White

This is the ATMMachine Driver for the Account class
*/

import java.util.*;
import java.io.*;

public class ATMMachineDriver{ 
   
   public static void main (String [] args) throws FileNotFoundException {
      run();
   }
   
   public static void run () throws FileNotFoundException {
   
      //creates a scanner to read keyboard input
      Scanner console = new Scanner (System.in);
      //an array to house the data from the file
      Account[] members = new Account[10];
   
      //variable to run again if there is another customer in line
      boolean moreCustomers = true;
   
      //calls methd that prints the description
      description(); 
      //calls method that asks for file name and reutrns the scanner
      Scanner fReader = getFileName(console);
      //calls method that fills the array with data from the file
      populate(members, fReader);
      
      //do while loop to run as long as there are more customers
      do{
      //variable to run again for more transaction
         boolean moreTransactions = true;
         //calls method that getsID and return the index of it in the array
         int index = getId(console, members);
      
         while(moreTransactions && moreCustomers){
         //calls method that prints the main menu of the ATM Machine
            display();
         //calls method that prompts user to enter a choice
            int choice = getChoice(console);
            switch(choice){
               case 1: checkBalance(index,members);
                  break;
               case 2: withdraw(index, members, console);
                  break;
               case 3: deposit(index,members,console);
                  break;
               case 4: listCustomers(index,members, console);
                  break;  
               case 5: 
                  moreTransactions = false;
                  System.out.print("Is there someone line behind you? (yes/no) ");
                  String result = console.next();
                  System.out.println();
                  //validates yes/no answer
                  while (!(result.contains("yes") || result.contains("no"))){
                     System.out.print("Invalid. Please enter \"yes\" or \"no\": ");
                     result = console.next();
                  }
                  if (result.equalsIgnoreCase("yes")){
                     moreCustomers = true;                  
                  } else { 
                     moreCustomers = false;
                     System.out.println("\nThank you for using this ATM Machine. \nGoodbye!");
                  } 
            }
         }   
      } while(moreCustomers);
   }
   
   
   
   //this method displays the balance on the account
   //call the proper method from the Account class
   public static void checkBalance (int index, Account[] accounts){
      System.out.print(accounts[index].getBalance());
   }
   
   //this method prompts the user to enter a deposit amount
   //then calls the correct method from the Account class
   public static void deposit (int index, Account[] accounts, Scanner console){
      double amount = getValidInput(console, "Deposit");
      accounts[index].deposit(amount);
   }
   
   //this method prints the description of the program and what it does
   public static void description (){
      String description = "This program will simulate an ATM machine. \n";
      description += "A menu will be displayed with options for the user to choose from. \n";
      description += "Based on the user's decision, the program will interact and display the information.";
      System.out.println(description);
      System.out.println();
   }
   
   //this method displays all the options that appears on the screen of an ATM machine
   public static void display (){
      System.out.println("\nMain Menu");
      System.out.println("1. Check Balance \n2. Withdraw \n3. Deposit \n4. Donate \n5. Close");
   }
   
   //this method prompts the user to enter the choice
   //valid choices are 1-4, if the user enters any other number then prompt user to enter a valid choice
   public static int getChoice(Scanner console){
      System.out.print("Enter a choice: ");
      int choice = console.nextInt();
      while(!(choice > 0 && choice <= 5)){
         System.out.println("Choice not valid. Try again.");
         display();
         System.out.print("Enter a choice: ");
         choice = console.nextInt();
      }
      return choice;    
   }
   
   //this method prompts the user to enter a file name
   //as long as the file does not exist, you need to prompt for a new file name
   public static Scanner getFileName(Scanner console) throws FileNotFoundException{
      System.out.print("Enter the file name: ");
      String name = console.next();
      File fName = new File(name);
      while (!fName.exists()){
         System.out.print("File not found. Enter a vaid file name: ");
         name = console.next();
         fName = new File(name);
      }
      Scanner fReader = new Scanner(fName);
      return fReader;
   }
   
   //this method prompts the uesr to enter their ID
   //and will keep prompting them until they enter a valid ID
   public static int getId (Scanner console, Account [] accounts) {
      //getId and checks if it exists in the array
      System.out.print("Enter your id: ");
      int id = console.nextInt();
      int index = searchId(id, accounts);
      //checks users input for the id
      while (index == -1){
         System.out.print("Invalid ID. Enter your ID: ");
         id = console.nextInt();
         index = searchId(id, accounts);         
      } 
      return index;  
   }
   
   //this method prompts the user for a valid input
   //as long as the input is not valid, keep prompting the user
   //a valid input must be a double and greater than 0
   public static double getValidInput(Scanner console, String type){
      System.out.printf("Enter a positive amount to %s: ", type);
      double value = console.nextDouble();
      while (value < 0){
         System.out.print("Value invlaid. Enter a valid amount: ");
         value = console.nextDouble();
      }
      return value;
   }
   
   //this method populates the arrays of the account by reading the info from the text file
   public static void populate (Account [] s, Scanner fReader) {
      for (int i = 0; i < s.length; i++){
         //variable for full name
         String name = "";
         //variable to read first name
         String firstName = fReader.next();
         //variable to read last name
         String lastName = fReader.next();
         //variable to read id
         int id = fReader.nextInt();
         //variable to read balance
         int balance = fReader.nextInt();
         
         
         //variable to combine firstName and lastName into name to store
         name = firstName + " " + lastName;
         
         //adds it to array
         s[i] = new Account(name, id, balance);
      }
   }
   
   //this method searches the array to find the given id
   //and returns the index of the id if the id is found 
   //and returns -1 if the id is not found
   public static int searchId (int id, Account [] accounts) {
      int result = -1;
      for (int i = 0; i < accounts.length; i++){
         if (id == accounts[i].getId()){
            result = i;
         }
      }
      return result;
   }

   
   //this method prompts the user to enter a withdraw amount
   //then calls the correct method from the Account class
   public static void withdraw (int index, Account[] accounts, Scanner console){
      double amount = getValidInput(console, "Withdraw");
      accounts[index].withdraw(amount);

   }
   
   //this method lists all the customers for this bank
   public static void listCustomers(int index, Account [] accounts, Scanner console){
      System.out.println("\nThank you for choosing to donate to the Amyotrophic Lateral Sclerosis (ALS) Association!");
      double amount = getValidInput(console, "Donate");
      //needs to take the amount donated from the account
      //Maybe print a list of people that donated?
      System.out.printf("You have donated $%.2f to the foundation. \nThank you for your support!\n", amount);
   }
   

   

   
   //add other features to use the unused methods from the Account class
   //earn 10 points extra credit by adding more options to the menu and adding more methids in the account class
   
  

}
/*Ethan Covert
  CSC 15
*/  
import java.util.*;
import java.util.Scanner;
import java.util.Date;
public class Account
{
   private int Id;
   private String name;
   private double balance;
   private double annualInterestRate;
   private Date dateCreated;
   private boolean active;
   
   public Account()
   {
      this.Id = 0;
      this.name ="";
      this.balance = 0;
      this.active = false;
   }
   public Account(int Id, double balance, String name)
   {
      this.name = name;
      this.Id = Id;
      this.balance = balance;
      activateAccount();
   
   }
   public void setActive(boolean b)
   {
      this.active = b;
   }
   public void activateAccount()
   {
      if(this.balance > 0)
      {
         setActive(true);
      }
      else
      {
         deactivateAccount();
      }      
   }
   public void deactivateAccount()
   {
      setActive(false);
   }
   public void setId()
   {
      this.Id = Id;
   }
   public int getId()
   {
      return Id;
   }   
   public void setName()
   {
      this.name = name;
   }
   public String getName()
   {
      return name;
   }
   public void close()
   {
      if(balance == 0);
      {
         deactivateAccount();
      }
   }
   public void setBalance(double b)
   {
      this.balance = b;
   }
   public double getBalance()
   {
      return balance;
   }   
   public double deposit(double amount)
   {
      balance = balance + amount;
      return balance; 
   }
   public double withdraw(double amount)
   {
      balance = balance - amount;
      return balance; 
   }
   public boolean equals(Account a)
   {
      return false;
   }
   public String toString()
   {
      return null;
   }
   
      
       
}   
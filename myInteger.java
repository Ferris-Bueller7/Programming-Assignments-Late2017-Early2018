/*
Ethan Covert
CSC 15
5/10/18
*/
import java.util.*;
public class myInteger
{
   private int value;
   public myInteger(int value)
   {
      this.value = value;
      
   }   
   public int getValue()
   {
      return value;
   }   
   public boolean isEven()
   {
      return value % 2 == 0;
   }
   public boolean isOdd()
   {
      return value % 2 != 0;
   }   
   public boolean isPrime()
   {
      for(int i = 2; i < value; i++)
      {
         if(value % 2 == 0)
         {  
            return false;
         }   
      }
      return true;
   }
   
   public static int getValue(int num)
   {
      return num;
   }   
   public static boolean isEven(int num)
   {
      return num % 2 == 0;
   }
   public static boolean isOdd(int num)
   {
      return num % 2 != 0;
   }   
   public static boolean isPrime(int num)
   {
      for(int i = 2; i < num; i++)
      {
         if(num % i == 0)
         {  
            return false;
         }   
      }
      return true;
   }
   
   public static int getValue(myInteger other)
   {
      return other.value;
   }   
   public static boolean isEven(myInteger other)
   {
      return other.value % 2 == 0;
   }
   public static boolean isOdd(myInteger other)
   {
      return other.value % 2 != 0;
   }   
   public static boolean isPrime(myInteger other)
   {
      for(int i = 2; i < other.value; i++)
      {
         if(other.value % 2 == 0)
         {  
            return false;
         }   
      }
      return true;
   }
   public boolean equals(int i)
   {
      return i == this.value;
   }   
   public boolean equals(myInteger x)
   {
      return x.value == this.value;
   }
   public static String parseInt(char[] nums)
   {
      int[] newNums = new int [nums.length];
      for(int i = 0; i < newNums.length; i++){ 
         newNums[i] = Character.getNumericValue(nums[i]);
      //Integer.parseInt(new String(char[] a));			 
      
      }
      return Arrays.toString(newNums);
   }
   public static int parseInt(String s)
   {
   
	   int number = Integer.parseInt(s);			 
      return number;
   } 
            
}   
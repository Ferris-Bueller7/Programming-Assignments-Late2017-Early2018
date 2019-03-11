/*
Ethan Covert
Patrick Silviera
2/27/18
*/ 
import java.util.Scanner;
public class storyTeller
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      String story = printStory(kb);
      System.out.println(story); 
   }
   public static String printStory(Scanner kb)
   {
      String story =" ";
      System.out.print("Que es tu nombre ");
      String name = kb.nextLine();
      System.out.print("What is your gender? ");
      String gender = kb.nextLine();
      System.out.print("How old are you? ");
      String age = kb.nextLine();
      System.out.print(" What college will you be attending? ");
      String college = kb.nextLine();
      System.out.print(" What city is your college in? ");
      String collegeTown = kb.nextLine();
      System.out.print("How many years will it take to graduate ");
      String gradYear = kb.nextLine();
      System.out.print("What will your profession be? ");
      String profession = kb.nextLine();
      System.out.print("What kind of pet do you have? ");
      String pet = kb.nextLine();
      System.out.print("What is your pets name? ");
      String petName = kb.nextLine();
      System.out.print("What is the name of the Website you visit the most? ");
      String website = kb.nextLine();
      System.out.print("What are your siblings' ages? ");
      int s1 = kb.nextInt();
      System.out.print("--> \n");
      int s2 = kb.nextInt();
      System.out.print("--> \n");
      int s3 = kb.nextInt();
      System.out.print("--> \n");
      story = "Once upon a time there was a person  named " + reverse(name);
      story = (story + ", "+ age +" years old. \n");
      story = (story + gender + " was attending " + college + " college. ");
      story = (story + gender + " became a " + profession + " within " + gradYear);
      story = (story + " years.\n One day on the way home " + capital(name) + " saw a ");
      story = (story + pet + " wandering the streets of " + collegeTown + ".\n");
      story = (story + name + " adopted the " + pet + " and named the ");
      story = (story + pet  +" "+ petName + ". " + capital(name) + " had 3 siblings and the youngest ");
      story = (story + " sibling is \n" + max(s1, s2, s3) + " and the oldest sibling is " + min(s1, s2, s3) + " years old. ");
      story = (story + gender + " spent a lot of time on the computer visiting the website with the \n");
      story = (story + " domain name " + website +". " + capital(name) + " and " + petName + " lived happily ever after!");
      return story; 
      
   }
   public static String domain(String s)
   {
      String web = "csus";
      return web;
   }
   public static String reverse(String s)
   {
      int length = s.length();
      String r = "";
      for(int i = length - 1; i >= 0; i--)
      {
         char c = s.charAt(i);
         r = r + c;
      }
      return r;   
   
   }
   public static String capital(String s)
   {
      String z = s.toUpperCase();
      return z;
         
   }
   public static double max(int a, int b, int c)
   {
      int max = Math.max(a, Math.max(b, c));
      return max;
   }
   public static double min(int a, int b, int c)
   {
      int min = Math.min(a, Math.min(b, c));
      return min;
   }
}      

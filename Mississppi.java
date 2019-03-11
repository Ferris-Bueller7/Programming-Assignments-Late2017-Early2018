/* Ethan Covert
1/30/18 
This is a program to spell the word "Mississppi" efficiently
*/ 
public class Mississppi
{
   public static void main(String[] args)// Calls completed code to display it
   {
      total();
   }
   public static void total()//Puts the finished code together to spell Mississppi
   {
      drawLetterM();
      ISS();      
      ISS();
      drawLetterP();
      drawLetterP();
      drawLetterI();
   }
   public static void drawLetterM()
   {
      System.out.println("M     M");
      System.out.println("MM   MM");
      System.out.println("M M M M");
      System.out.println("M  M  M");
      System.out.println("M     M");
      System.out.println("M     M");
      System.out.println("M     M\n");
    }
    public static void drawLetterI()
    {
      System.out.println("IIIII");
      System.out.println("  I  ");
      System.out.println("  I  ");
      System.out.println("  I  ");
      System.out.println("  I  ");
      System.out.println("  I  ");
      System.out.println("IIIII\n");
    }
    public static void drawLetterS()
    {
      System.out.println(" SSSSS ");
      System.out.println("S     S");
      System.out.println("S");
      System.out.println(" SSSSS ");
      System.out.println("      S");
      System.out.println("S     S");
      System.out.println(" SSSSS \n");
    } 
    public static void drawLetterP()
    {
      System.out.println("PPPPPP");
      System.out.println("P     P");
      System.out.println("P     P");
      System.out.println("PPPPPP");
      System.out.println("P");
      System.out.println("P");
      System.out.println("P\n");
    }
    public static void ISS()// Created to remove repeated proccess of "ISS"
    {
      drawLetterI();
      drawLetterS();
      drawLetterS();
    }



} 
 
 
    
      
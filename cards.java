/*Ethan Covert
  4/18/18
  CSC 15*/ 
import java.util.Scanner;
public class cards
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      sum(kb);
   }
   public static void sum(Scanner kb)//This runs the entire program
   {
      int combinations = 0;
      int totalRun = 0;
      int [] deck = initialize();
      boolean play = true;
      while(play)
      {
        int guessSum = dataValidation(kb);
         kb.nextLine();
         System.out.println("All the possible combinations are:");
         for(int i = 0; i < deck.length; i++)
         {
            for(int j = i + 1 ; j < deck.length; j++)
            {
               for(int k = j +1 ; k < deck.length; k++)
               {
                  for(int l = k + 1; l < deck.length; l++)
                  {
                     totalRun++;              //this counts the total combinations of the 4 cards
                     if( guessSum == deck[i] + deck[j] + deck[k] + deck[l])
                     {
                        combinations++;
                        System.out.println(deck[i] + "  " + deck[j] + "  " + deck[k] + "  " + deck[l] + "  ");
                     }   
                        
                     
                  
                  }
               }   
            }
         }    
         System.out.println("The possible combinations are: " + combinations); 
         System.out.println("The number of picks that yield the sum of " + guessSum + " is " + totalRun);
         System.out.println("Do you want to run again?");
         String answer = kb.nextLine();
         while(!(answer.equalsIgnoreCase("yes")) && !(answer.equalsIgnoreCase("no")))   //this makes sure only the correct answers are given  
         {
            System.out.println("enter yes or no");
            answer = kb.nextLine(); 
            //break;
         }
         if((answer.equalsIgnoreCase("no")))
         {
            play = false;
         }
         else
         {
            play = true;
         }
      }         
   
   }
   
   public static int dataValidation(Scanner kb)//this makes sure all the numbers imputed are within the domain
   {
      int value = -1;
      
      while (value < 0 || value > 52)
      {
         System.out.print("Enter the sum of the combinations that you want: ");
         while(!kb.hasNextLine())
         {
            kb.nextInt();
            //System.out.print("Enter the sum of the combinations that you want: ");
               
            
         }
         value = kb.nextInt();
      }   
         return value;
   }   
   public static int[] initialize()
   {
      int[] deck = new int[52];
      for(int i = 0; i < 4; i++)
      {
         for(int z = 0; z < 13; z++)
         {
            deck[z+(13*i)] = z + 1;
         }
      }      
   return deck;
   } 
}   

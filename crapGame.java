/*Ethan Covert
  4/14/18
  CSC 15
  This program plays the crap game */
import java.util.Random;
import java.util.Scanner;
public class crapGame
{
   public static void main(String[] args)
   {
      description();
      play();
   }
   public static void play()//The main method that runs the program and calculates the wins and losses
   {
      Scanner kb = new Scanner(System.in);
      int numOfWins = 0;
      int numOfLosses = 0;
      int thePoint = 0;
      int comeOutRoll = 0;
      int numOfPlays = 0;
      boolean playAgain = true;
      while(playAgain)
      {
         for (int i = 0; i < 10000; i++)
         {
            Random rOll = new Random();
            int dice1 = rOll.nextInt(6) + 1;
            int dice2 = rOll.nextInt(6) + 1;
            comeOutRoll = dice1 + dice2;
            winOrLose(comeOutRoll);
            if (winOrLose(comeOutRoll) == "Win")
            {
               numOfWins++;
            }
            else if (winOrLose(comeOutRoll) == "Lose")
            {
               numOfLosses++;
            }
            else
            {
                thePoint = comeOutRoll;
                keepRolling(thePoint);
                if(keepRolling(thePoint) == "seven")
                {
                numOfLosses++;
                }
                else //(keepRolling(thePoint) == "The Point")
                {
                numOfWins++;
                }
            }
                        
         }
         System.out.println("In the simulation:");
         System.out.println("won " + numOfWins +" times");
         System.out.println("loss " + numOfLosses +" times");
         System.out.println("for a probability of " + winProbability(numOfWins,numOfLosses) + "%");
         System.out.println("Do you want to use the App again? (yes/no)");
         String answer = kb.nextLine();
         while(!(answer.equalsIgnoreCase("yes")) && !(answer.equalsIgnoreCase("no")))
         {
            System.out.print("enter yes or no ");
            answer = kb.nextLine();
            //break;
         }
         if(answer.equalsIgnoreCase("no"))
         {
               playAgain = false;
         }
         else
         {
            numOfWins = 0;
            numOfLosses = 0;
            thePoint = 0;
            comeOutRoll = 0;
            numOfPlays = 0; 
         }
      }    
   }
   public static String winOrLose(int comeOutRoll)
   {
      String answer = "";
      if(comeOutRoll == 7 || comeOutRoll == 11)
      {
         answer =("Win");
      }
      else if(comeOutRoll == 2 || comeOutRoll == 3 || comeOutRoll == 12)
      {
         answer =("Lose");
      }
      else//(comeOutRoll == 4 || comeOutRoll == 5 || comeOutRoll == 6 || comeOutRoll == 8 || comeOutRoll == 9 || comeOutRoll == 10)
      {
         answer =("The Point");
      }
      return answer;
   }
   public static void description()// Shows the prompt
   {
      String story = "";
      story = (story + "Computer will play a crap game for you. Here are the \n rules of the game: \n");
      story = (story + " Two six sided dice are rolled \n Come out roll: This first roll of the dice ");
      story = (story + "in a craps round \n A come out roll of 7 or 11 automatically wins \n A come ");
      story = (story + "out roll of 2, 3 , or 12 automatically losses \n A come out roll of 4, 5, 6, ");
      story = (story + "8, 9, or 10 becomes The \n point. If the player gets the point he/she will keep \n");
      story = (story + "playing by rolling the dice until he/she gets a 7 or the \n point. \n If the point");
      story = (story + "is rolled first, then the player wins the \n bet. \n If a 7 is rolled first, then ");
      story = (story + "the player losses.");
      System.out.println(story);
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println("Lets start playing");
   }
   public static double winProbability(double wins, double losses)//calculates the ratio of win percentage
   {
      double probability = (wins)/(wins + losses);
      return probability;
   } 
   public static String keepRolling(int thePoint)//keeps rolling until either rolls the point or a 7
   {
      String answer = "";
      Random ROll = new Random();
      int total = 0;
      while(total !=7 && total != thePoint)
      {
         int Dice1 = ROll.nextInt(6)+1;
         int Dice2 = ROll.nextInt(6)+1;
         total = Dice1 + Dice2;
         break;
      }   
      if(total == 7)
      {
         answer = "seven";
      }
      else//(total == thePoint)
      {
         answer = "thePoint";
      }      
      return answer;  
   }  
}         
         
               
      
   


/*Ethan Covert
Patrick Silveira
2/13/18
This program creates a 2 carrot design using for loopss
*/
public class labTwo
{
   public static final int SIZE = 12; //allows you to change size of picture efficently 
   public static void main(String[] args)
   {
      draw();   
   }
   public static void draw()// creates the picture 
   {
      line();
      top();
      top();
      line();
      bottom();
      bottom();
      line();
   }
   public static void line()
   {
      System.out.print("+");
      for(int count = 1; count <= SIZE*2; count++)
      {
         System.out.print("-");
      }
      System.out.print("+");
      System.out.println();
   }
   public static void top()// creates the top carrot shape
   {
      for(int level=1; level<=SIZE; level++)
      {
         System.out.print("|");
         for(int space = 1; space <=SIZE-level; space++)
         {
            System.out.print(" ");
         }
         System.out.print("^");
         for(int space=1; space <= (level-1) * 2; space++)
         {
            System.out.print(" ");
         }
         System.out.print("^");
         for(int space=1; space<= SIZE-level; space++)
         {
            System.out.print(" ");
         }   
         System.out.print("|");
         System.out.println();
      }
   }

  public static void bottom()//creates the bottom "V" shape
   {
      for (int level=1; level<=SIZE; level++)
      {
         System.out.print("|");
         for(int space=1; space<=(level-1); space++)
         {
            System.out.print(" ");
         }
         System.out.print("V"); 
         for(int space=1; space<=(SIZE-level) * 2; space++)
         {
            System.out.print(" ");
         }
         System.out.print("V");
         for(int space=1; space<=(level-1); space++)
         {
            System.out.print(" ");
         }
         System.out.print("|");
         System.out.println();
      }   
   }                
      
}
 
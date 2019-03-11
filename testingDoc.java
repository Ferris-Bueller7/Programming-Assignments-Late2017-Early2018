public class testingDoc
{
   public static void main(String[] args)
   {
      int[][] board = new int[9][4];
      for (int row = 0; row <9; row++)
      {
         for(int col = 0; col < 4; col++)
         {
            
            board[row][col] = 5;
            System.out.println(board[row][col]);
         }
         //System.out.println(board[row][col]);
      }
      System.out.println(board[9][4]);
      //System.out.print("/\\");     
     
      /*for (int i=1; i <= 10; i++)
      {
         for (int j =1; j <= 10 - i; j++)
         {
            System.out.print(" ");
         }
         for (int j = 1; j <= 2 * i - 1; j++)
         {
            System.out.print("*");
         }
         System.out.println();*/
      }
   }
               
  
         
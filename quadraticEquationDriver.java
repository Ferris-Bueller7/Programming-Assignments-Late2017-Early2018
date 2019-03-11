/* Ethan Covert
5/1/18
CSC 15
*/
import java.util.*;
import java.io.*;
public class quadraticEquationDriver
{
   public static void main(String[] args) throws IOException
   {
      quadraticEquation[] e = fillArray();
      solve(e);
         
   }
   public static void print (quadraticEquation[] e)
   {
      for(int i = 0; i< e.length; i++)
      {
          System.out.println(e[i].toString());   
      }
    }  
   public static void solve (quadraticEquation[] e)
   {
      for(int i = 0; i< e.length; i++)
      {
         System.out.println("e = " + e[i]);
         System.out.println("r1 = " + e[i].getRoot1());
         System.out.println("r2 = " + e[i].getRoot2());
      }
   } 
   public static quadraticEquation [] fillArray() throws IOException
   {
         quadraticEquation [] e = new quadraticEquation[10];
         File f = new File("QuadraticFormulaNum.txt");
         Scanner input = new Scanner(f);
         int index = 0;
         while(input.hasNextLine())
         {
            String line = input.nextLine();
            Scanner token = new Scanner(line);
            int a = token.nextInt();
            int b = token.nextInt();
            int c = token.nextInt();
            quadraticEquation e1 = new quadraticEquation(a,b,c);
            e[index] = e1;
            index++;
         }
         return e;
   }

}

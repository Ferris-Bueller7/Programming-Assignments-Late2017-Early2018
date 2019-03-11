import java.util.*;
import java.io.*;
public class EquationDriver
{
   public static void main(String[] args) throws IOException
   {
      Equation[] e = fillArray();
      
      
      //Scanner kb = new Scanner(System.in);
      //Equation[] e = fillArray(kb);
      print(e);
      /*Equation e1 = new Equation(3,6,2);
      System.out.println(e1);
      double dis = e1.getDis();
      System.out.println(dis);
      double root1 = e1.getRoot1();
      double root2 = e1.getRoot2();
      System.out.println(root1 + " " + root2);
      e1.setA(4);
      //System.out.println(e1);
      System.out.println(e1.getA());
      Equation e2 = new Equation(3,8,4);
      System.out.println(e2);
      Equation result = e1.add(e2);
      System.out.println(result);
      System.out.println(Equation.getCount());
      boolean result = equation*/
   }
   public static Equation[] fillArray(Scanner kb)
   {
      Equation[] e = new Equation[3];
      for (int i = 0; i < 3; i++)
      {
         System.out.print("Enter a b c");
         double a = kb.nextDouble();
         double b = kb.nextDouble();
         double c = kb.nextDouble();   
         Equation e1 = new Equation(a,b,c);
         e[i] = e1;
      }   
      return e;
    }
    public static void solve (Equation[] e)
    {
      for(int i = 0; i< e.length; i++)
      {
         System.out.println("e = " + e[i]);
         System.out.println("r1 = " + e[i].getRoot1());
         System.out.println("r2 = " + e[i].getRoot2());
      }
    }  
    public static void print (Equation[] e)
    {
      for(int i = 0; i< e.length; i++)
      {
          System.out.println(e[i].toString());   
      }
    }
    public static Equation[] fillArray() throws IOException
    {
      //declare an array of Equation
      Equation [] e = new Equation[4];
      //create file object
      File f = new File("mydata.txt");
      //create a scanner object
      Scanner input = new Scanner(f);
      int index = 0;
      while(input.hasNextLine())
      {
         //read one line from the input file
         String line = input.nextLine();
         //create a scanner object for string line
         Scanner token = new Scanner(line);
         int a = token.nextInt();
         int b = token.nextInt();
         int c = token.nextInt();
         //create teh object1
         Equation e1 = new Equation(a,b,c);
         //store the reference in the array
         e[index] = e1;
         index++;
      }   
      return e;
    }  
      
      

}      
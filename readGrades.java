import java.io.*;
import java.util.*;
public class readGrades
{
   public static void main(String[] args) throws IOException
   {
      File f =  new File("randomNumbers.txt");
      Scanner input = new Scanner(f);
      double avg = getAvg(input);
      System.out.println(avg);
   }
   public static double getAvg(Scanner input) throws IOException
   {
      double sum = 0;
      int count = 0;
      double avg = 0;
      while(input.hasNextInt())
      {
         sum = sum + input.nextInt();
         count++;
      }
      avg = sum/count;
      return avg;
         
   }
}   
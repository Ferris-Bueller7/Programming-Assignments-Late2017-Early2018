/*
Ethan Covert
CSC 15
5/10/18
*/
public class myIntegerDriver
{
   public static void main (String[] args)
   {
      myInteger n1 = new myInteger(5);
      myInteger n2 = new myInteger(24);
      int v = n1.getValue();
      boolean e = n1.isEven();
      boolean o = n2.isOdd();
      boolean p = n1.isPrime();
      boolean q = n1.equals(5);
      boolean x = n1.equals(n2);
      String s = "3859";
      char[] chars = {'3', '5', '3', '9'};
      System.out.println("n1 is even? "+ e);
      System.out.println("n1 is prime? "+ p);
      System.out.println("15 is prime? "+ myInteger.isPrime(15));
      System.out.println(myInteger.parseInt(chars));
      System.out.println(myInteger.parseInt(s));
      System.out.println("n2 is odd? " + o);
      System.out.println("is 45 odd? " + myInteger.isOdd(45));
      System.out.println("is n1 equal too 5? " + q);
      System.out.println("is n1 is equal to n2? " + x);
      //boolean a1 = myInteger.isEven(11);
      //a1 = myInteger.isEven(n1);
      //System.out.println(a1);   
   }

}

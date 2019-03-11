public class Equation 
{
   private double a;
   private double b;
   private double c;
   
   private static int count = 0;
   
   //constructor = no return type, same name as class name
   public Equation(double aa, double bb, double cc)
   {
      a = aa;
      b = bb;
      c = cc;
      count++;
   }
   public static int getCount()
   {
      return count;
   }   
  
   //setter methods
   public void setA(double newA)
   {
      a = newA;
   }
   public void setB(double newB)
   {
      b = newB;   
   }
   public void setC(double newC)
   {
      c = newC;   
   }
   
  
   //accessor methods
   public double getA()
   {
      return a;
   }
   public double getB()
   {
      return b;
   }
   public double getC()
   {
      return c;
   }   
   
   public Equation add(Equation e)
   {
      double aa = this.a + e.a;
      double bb = this.b + e.b;
      double cc = this.c + e.c;
      Equation sum = new Equation(aa, bb, cc);
      return sum;
   }
   public Equation subtract(Equation e)
   {
      double aa = this.a - e.a;
      double bb = this.b - e.b;
      double cc = this.c - e.c;
      Equation difference = new Equation(aa, bb, cc);
      return difference;
   }
   public Equation multiply(Equation e)
   {
      double aa = this.a * e.a;
      double bb = this.b * e.b;
      double cc = this.c * e.c;
      Equation product = new Equation(aa, bb, cc);
      return product;
   }   
   public double getDis()
   {
      double d = (b*b - 4*a*c);
      if(d > 0)
      {
         return Math.sqrt(d);
      }
      return 0;
   }
   public double getRoot1()
   {
      return (- b + getDis())/(2*a);
   }
   public double getRoot2()
   {
      return (- b - getDis())/(2*a);
   }
   public String toString()
   {
      return a + "x^2 + " + b + "x + " + c;
   }
   public boolean equals (Equation e)
   {
      return e.a == this.a && e.b == this.b && e.c == this.c;
   }
} 
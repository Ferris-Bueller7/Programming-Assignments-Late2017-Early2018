/*
Ethan Covert
Patrick Silveira
CSC15
2/17/18
To covert units of measure
*/
public class conversion
{
   public static void main(String[] args)//Where the chart was generated
   {
      line();
      System.out.println();
      output();
      line();
            
   }
   public static double feetToInch(double foot)//converting feet to inches
   {
      double inch = foot * 12;
      return inch;
   }   
   public static double feetToMeter(double foot)//converting feet to meters
   {
      double meter = foot * .305;
      return meter;
   }
   public static double meterToFeet(double meter)//converting meters to feet
   {
      double foot = meter /.305;
      return foot;
   }
   public static double meterToCenti(double meter)//converting meters to centimeters
   {
      double centi = meter * 100;
      return centi; 
   }
   public static double centiToMilli(double centi)//converting centimeters to millimeters
   {
      double milli = centi * 10;
      return milli;
   }
   public static void line()
   {
      for(int i=1; i<=54; i++)
      {
         System.out.print("-");
      }
   }
   public static void output()// Where the calculations were put into an orderly fashion
   {
      System.out.println("Feet      "+"Inch       "+"Meter    "+"Centimeter   "+"Millimeter");
      for(int i=1; i<=20; i++)
      {
         double feet = i;
         double inch = feetToInch(i);
         double meter = feetToMeter(i);
         double centi = meterToCenti(meter);
         double milli = centiToMilli(centi);
         System.out.printf(" %3d. %-1.2f%12.2f%14.2f%13.2f",i,inch,meter,centi,milli); //rounding and organizing the columns 
         System.out.println();
         
      }
   }        
   






}
import java.util.Scanner;

class HarmonicMean
{
  public static void main (String [] args)
  {
    Scanner scan = new Scanner(System.in);
    
    double x, y, average, hm;
    
    System.out.print("Enter two values: ");
    x = scan.nextDouble();
    y = scan.nextDouble();
    
    average = (x+y)/2;
    hm = 2 / ( 1/y - 1/x);
    
    System.out.print("Average: " + average + "   Harmonic Mean: " + hm );
  }
}
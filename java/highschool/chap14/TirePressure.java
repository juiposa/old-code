import java.util.Scanner;
  
class TirePressure
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int leftFront, rightFront, leftBack, rightBack, allGood = 0;
    
    System.out.print("Enter in the tire pressure of ...");
      
    System.out.print("Left Front: ");
    leftFront = scan.nextInt();
      
    System.out.print("Right Front: ");
    rightFront = scan.nextInt();
    
    System.out.print("Left Back: ");
    leftBack = scan.nextInt();  
    
    System.out.print("Right Back: ");
    rightBack = scan.nextInt();
    
    if ( leftFront <= rightFront + 3 && leftFront >= rightFront - 3) //Checks left front tire
    allGood = allGood + 1;
    else
    System.out.print("Left front tire's pressure is off. ");
    
    if ( rightFront <= leftFront + 3 && rightFront >= leftFront - 3) //Checks right front tire
    allGood = allGood + 1;
    else
    System.out.print("Right front tire's pressure is off. ");
      
    if ( leftBack <= rightBack + 3 && leftBack >= rightBack - 3) //Checks left back tire
    allGood = allGood + 1;
    else
    System.out.print("Left back tire's pressure is off. ");
      
    if ( rightBack <= leftBack + 3 && rightBack >= leftBack - 3) //Checks right back tire
    allGood = allGood + 1;
    else
    System.out.print("Right back tire's pressure is off. ");
    
    if (allGood == 4)
      System.out.print("All is good.");
      
  }
  
}
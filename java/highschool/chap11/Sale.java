import java.util.Scanner;
  
class Sale
{
  public static void main(String[] args)
  {
    
    double cents, discount;
    
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Input your purchase in cents: ");
    cents = scan.nextInt();
    
    if (cents >= 1000)
    {
      discount = cents - (cents * 0.1);
      System.out.print("Your discounted purchase will cost " + discount + " cents.");
    }
    if (cents < 1000)
      {
        System.out.print("Sorry, your purchase must be worth more than $10.");
      }
                       
  }
}
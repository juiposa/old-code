import java.util.Scanner;
  
class rectangleArea
{
  public static void main(String[] args)
  {
    
    Scanner scan = new Scanner(System.in);
    
    int x1, x2, y1, y2, l, w, area = 1;
    
    System.out.println("When you want to quite, enter all values as 0 or enter vales that will make the area.");
    
    while(area != 0)
    {
      System.out.println("Enter in the first and second x values: ");
      x1 = scan.nextInt();
      x2 = scan.nextInt();
      
      System.out.println("Enter in the first and second y values: ");
      y1 = scan.nextInt();
      y2 = scan.nextInt();
      
      if(x1 < x2)
        l = x2 - x1;
      else
        l = x1 - x2;
      
      if(y1 < y2)
        w = y2 - y1;
      else
        w = y1 - y2;
      
      area = l * w;
      
      System.out.println("The area is: " + area);
    }
  }
}
     
 
    
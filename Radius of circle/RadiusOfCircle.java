
import java.io.*;
import java.util.*;
import java.lang.Math; 


public class RadiusOfCircle
{
  
  public static void RadiusOfCircle(){
    
    Scanner kbReader = new Scanner(System.in);
    System.out.print("Please enter the area of your circle: ");
    Double area = kbReader.nextDouble();
    double raidus  = Math.sqrt((area/Math.PI));
    System.out.println("The radius of your circle is: " + raidus + "m");
  }
  
  public static void whatsYourName(){
  	
    Scanner kbReader = new Scanner(System.in);
    System.out.print("Please enter your first name: ");
    String firstName = kbReader.nextLine();
    System.out.print("Please enter your last name: ");
    String lastName = kbReader.nextLine();
    System.out.println("You first and last name are: " + firstName + " " + lastName);
  }
    
    
}

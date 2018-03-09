
/**
 * Write a description of class RaidusOfCircle here.
 * 
 * @author dijosto
 * @version 3/6/2018
 */
import java.io.*;
import java.util.*;
import java.lang.Math;
public class RaidusOfCircle
{
    public static void RadiusOfCircle(){
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Please enter the area of your circle: ");
        double area = kbReader.nextDouble();
        double raidus = Math.sqrt((area/Math.PI));
        System.out.print("The radius of your circle is: " + raidus + "m");
    }
}

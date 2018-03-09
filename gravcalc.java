
// gravity calculator
import java.io.*;
import java.util.*;
public class gravcalc
{
    public static void main(String args[]){
        double gravity =-9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Please enter your falling  time: ");
        double fallingTime = kbReader.nextDouble();
        kbReader = new Scanner(System.in);
        System.out.print("Please enter your initial position: ");
        double initialPosition = kbReader.nextDouble();
        double finalPosition = initialPosition + (gravity * fallingTime);
        System.out.println("The object's position after " + fallingTime +
" seconds is " + finalPosition + " m.");
// output is: The object's position after 10.0 seconds is 0.0 m.
// without revising
// finalPosition with a falling time of 10 seconds with a initial position of 100m is
// equal to 1.8999999999999915
    }
    
}


/**
 * Is your integer even or odd?
 * 
 * @author dijosto
 * @version 3/9/2018
 */
import java.io.*;
import java.util.*;
public class Tester
{
    public static void EvenOrOdd(){
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int eoInt = kbReader.nextInt();
        if(eoInt%2 == 0){
            System.out.printf("The integer %d is even",eoInt);}
        else{
            System.out.printf("The integer %d is odd",eoInt);}
        }
}

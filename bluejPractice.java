
/**
 * A combined program of all of the questions.
 *
 * @author dijosto
 * @version 2/28/2018
 */
public class bluejPractice
{   
    
    // saying hello and welcome in german
    public static void halloUndWilkommen()
    {
        System.out.println("Hallo und Wilkommen");
        
    }
    
    
    // as the function name states
    public static void sumOfOne2Ten()
    {
        System.out.println(1+2+3+4+5+6+7+8+9+10);
    }
    
   
    // this is a function for x! i thought it
    // was a good idea to solve the question
    public static void productOf(int N)
    {
        int product = 1;
        for (int number = 2; number <= N; number++) product *= number;
        System.out.println(product);
    }
    
    
    // shows you what a balance of x would equal with
    // a tax rate of 5% over 3 years. I was going to try and
    // make it go for how ever many years you inputted but i
    // decided not to.
    public static void accBalance(int balance){
    double first = balance + (balance * 0.05);
    double second = first + (first * 0.05);
    double third = second + (second * 0.05);
    System.out.println("Your bank account's estimated intrest value:");
    System.out.printf("First year: $%f\n",first);
    System.out.printf("Second year: $%f\n",second);
    System.out.printf("Third year: $%f\n",third);
    }
    
    
    // this is just printing a ASCII version of my name.
    public static void danieltoASCII(){
       
       System.out.println("########     ###    ##    ## #### ######## ##       ");
       System.out.println("##     ##   ## ##   ###   ##  ##  ##       ##       ");
       System.out.println("##     ##  ##   ##  ####  ##  ##  ##       ##       ");
       System.out.println("##     ## ##     ## ## ## ##  ##  ######   ##       ");
       System.out.println("##     ## ######### ##  ####  ##  ##       ##       ");
       System.out.println("##     ## ##     ## ##   ###  ##  ##       ##       ");
       System.out.println("########  ##     ## ##    ## #### ######## ######## "); 
    }
    
    // my name in a box
    public static void boxName(){
        System.out.println(" +-+-+-+-+-+-+");
        System.out.println(" |D|A|N|I|E|L|");
        System.out.println(" +-+-+-+-+-+-+");
   }
   
   
   // drawing a face
   public static void drawFace(){
       System.out.println(" ______ ");
       System.out.println("[(o)(o)]");
       System.out.println("[ ~~~ /");
       System.out.println(" -----");
    }
    
    
    // very bad ascii version of Composition C
   public static void asciiPaint(){ 
       System.out.println("#####!00000");
       System.out.println("#####!00000");
       System.out.println("#####!00000");
       System.out.println("-----!-----");
       System.out.println("00000!00000");
       System.out.println("00000!00000");
       System.out.println("-----!-----");
       System.out.println("@!000!%%!00");
       System.out.println("@!000!%%!00");
       System.out.println("@!000!00!00");
    }
    
    // ascii house
    public static void drawHouse(){
        System.out.println("   +   ");
        System.out.println("  + +  ");
        System.out.println(" +   + ");
        System.out.println("+-----+");
        System.out.println("+ .-. +");
        System.out.println("+ [ ] +");
        System.out.println("+-+-+-+");
    }
    
    // a dog saying hello
    public static void drawDog(){
        System.out.println("              A");
        System.out.println("   (HELLO)    AMa");
        System.out.println("       [_]    VMMML");
        System.out.println("            h  VMMHMA");
        System.out.println("             VAMMMMMMA;,.");
        System.out.println("              VHHHHHHV^^^^^");
        System.out.println("               AMMMMM");
        System.out.println("              AMMMMMHHha           A");
        System.out.println("              AMMMMMMMMMmma        VA");
        System.out.println("              MMMMMMMMMMMMMMMA      AV");
        System.out.println("              VMMMMMMMMMMMMMMMMMA   AV");
        System.out.println("              VMMMMMMMMMMMMMMMMMA   AV");
        System.out.println("              MM  VMMMMMMMMMMMMMMMMMV");
        System.out.println("              MM     VMMMMMMMMMMMMMV");
        System.out.println("____________AMA__AMMMMMMMMMMMMMMMV_________");
    }
   
}



    

package cal;

import java.util.Scanner;

public class Sqrt {
    

public void sqrt(){
    int a;
     Scanner s = new Scanner(System.in);
    System.out.println("Enter a number:");
    a =s.nextInt();
    int sqr = a*a;
    System.out.println("Square of the number is: " + sqr);
}
}
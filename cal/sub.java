
package cal;

import java.util.Scanner;

public class Sub {
    public void subtract(){
     int a,b,c; Scanner s = new Scanner(System.in);
    
    System.out.println("Enter two numbers:");
    a = s.nextInt();
    b = s.nextInt();
    c=a-b;
    System.out.println("Subtract: " + c);
    s.close();


    }
   

}

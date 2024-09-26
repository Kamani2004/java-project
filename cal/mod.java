
package cal;

import java.util.Scanner;

public class Mod {
    public void Modulus(){

        int a,b,c;
        System.out.println("Enter two numbers:");
         Scanner s = new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=a%b;
        System.out.println("Modulus "+c);

     }
}

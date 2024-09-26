import java.util.*;

public class SInterest {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("calculate the simple interest");
        System.out.print("Enter the principal amount: ");
        int principal = input.nextInt();
        System.out.print("Enter  the rate amount: " );
        float rateAmount = input.nextFloat();
        System.out.print("Enter the years: ");
        int year = input.nextInt();

        float interest= (principal*rateAmount * year)/100;
        System.out.println("your simple interest rate: " + interest);

    }
}


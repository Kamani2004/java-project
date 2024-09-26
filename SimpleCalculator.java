
import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
 

        System.out.print("Enter the first number: ");
        int firstNumber = scr.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scr.nextInt();
 

        System.out.print("Enter the operation(+, -, *, /, %): ");
        String operation = scr.next();
        int result = Operation(firstNumber, secondNumber, operation);
        System.out.println("Your answer is: " + result);
    }
 
    public static int Operation(int firstNumber, int secondNumber, String operation)
    {
        int result = 0;
        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "%":
                result = firstNumber % secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        return result;
    }
}
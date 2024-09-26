import java.util.Scanner;

public class Converstion {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter the number of inches");
        Double inches=scr.nextDouble();
        
        int feet= (int)(inches/12);
        Double remaining = inches%12;

        System.out.print(inches+ "=" +feet+ "feet"+remaining+"inches" );
        scr.close();
    }
    
}
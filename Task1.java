 import java.util.Scanner;
class Rent{

    int displayRent (int value){
        
        int i=0 ;
       
        while(i<10){
            int incre=(value*10)/100;
            value=value+incre;
          System.out.println(value);
          i++;
        }
     return 0;
    }
}
public class Task1 {
    public static void main(String[] args) {
        Rent rentobj = new Rent();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial rent value:");
        int value = scanner.nextInt();
        rentobj.displayRent(value);
        
        
    }
}

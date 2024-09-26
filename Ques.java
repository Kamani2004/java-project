import java.util.*;
   
public class Ques {
                                //  question no. 1 Print the sum and average

    float a=12.6F;
    float b=15.2F;
    float sum=0;
    float average;
    void sum(){
        sum = a+b;
        // System.out.println(sum);
    }
    
    void average(){
        average = sum / 2;
        // System.out.println(average);
    }
    public static void main(String[] args) {
        Ques q= new Ques();
        q.sum();
        q.average();
        System.out.println("Sum: " + q.sum);
        System.out.println("Average: " + q.average);
    // sum();
    // average();
    }
 
}

//       question no. 2   print the  sum used in array 

// public class Main {
//     public static void main(String[] args) {
//         int[] numbers = {1, 2, 3, 4, 5};
//         int sum = 0;
//         for (int i = 0; i < numbers.length; i++) {
//             sum += numbers[i];
//         }
//         System.out.println("Sum: " + sum);
//     }
// }
        // question no. 3 print the rs and paise 

// public static void main(String[] args) {
//     float a=15.26F;
//     int rupess =(int)a;
//     System.out.println("Rupees: "+rupess);
//     float paise =(a-rupess)*100;
//     System.out.println("Paise: "+(int)paise);
//  }
// }
    //  question no.4  print even and odd method

        // public static void main(String[] args) {
        //     Scanner scan = new Scanner(System.in);
        //     System.out.print("enter first number = ");
        //     int num1 =scan.nextInt();
        //     System.out.print("enter second number = ");
        //     int num2 = scan.nextInt();
        //    int sum = num1 + num2; 
        //     System.out.println("Sum = " + sum);
   
        //     if(num1 % 2 == 0) {
        //         System.out.println(num1 + " is even");
        //     } else {
        //         System.out.println(num1 + " is odd");
        //     }
            
        // }
         // question no.5 print the greastest number

                //  public static void main(String args[]){ 
                //                 Scanner sc=new Scanner(System.in); 
                //                 System.out.println("First input numbers"); 
                //                 int A=sc.nextInt(); 
                //                 System.out.println("Second input numbers"); 
                //                 int B=sc.nextInt(); 
                //                 if (A>B){ 
                //                    System.out.println("A is greater than B");    
                //                  } 
                //                 else{ 
                //                    System.out.println("B is greater than A"); 
                //                 } 
                //             } 
         
               
    
        //  question no. 6  input a float number to round of
        // public static void main(String[] args) {
    
        //     float a=1.3f;
        //     int b=(int)a;
        //     float c=a-b;
           
    
        //     if(c>=0.5)
        //     System.out.println(b+1);
        //     else
        //     System.out.println(b);
         

                //question no.7 print first and last digits 

                //  public static void main(String args[]) {
                //     int number = 23546;     
                //     int lastDigit ;
                
                //     lastDigit = Math.abs(number % 10);
                
                //     System.out.println("show the Last digit:- " + lastDigit);
                //   }
           
                //  question no. 8 print marks  and grades 
                
                // public static void main(String[] args) {
                //      int hindi,english,math,physics,chemistry;
                //      float Percentage , total;

                //      System.out.print(" Please Enter the Five Subjects Marks :\n ");
                //      Scanner scanner = new Scanner(System.in);
                //      english = scanner.nextInt();
                //      math = scanner.nextInt();
                //      hindi=scanner.nextInt();
                //      physics=scanner.nextInt();
                //      chemistry=scanner.nextInt();
                //      total = english + math + hindi + physics + chemistry;
                //      Percentage = (total / 500) * 100;
                //      System.out.println("Total Marks : " + total);
                //      System.out.println("Percentage : " + Percentage);
                //      if (Percentage >= 90)
                //      System.out.println("Grade : A");
                //      else if (Percentage >= 80)
                //      System.out.println("Grade : B");
                //      else if (Percentage >= 70)
                //      System.out.println("Grade : C");
                //      else if (Percentage >= 60)
                //      System.out.println("Grade : D");
                //      else
                //      System.out.println("Grade : E");

                    
                // }
                 // question no. 9 print a number between 1 to 100
               
                //     public static void main(String[] args) {
                 
                //         int num =1;
                //         while(num <= 100) {
                //             System.out.println(num);
                //             num++;
                //         }
                //  }
                 // question no. 10 print a number between 100 to 1

        //          public static void main(String[] args) {
        //             int num = 100;
        //             while(num >= 1) {
        //                 System.out.println(num);
        //                 num--;
        //             }
         
        // }
      // question no. 11 input any 10 number print the sum
        // public static void main(String[] args) {
        //     Scanner scanner = new Scanner(System.in);
        //     int a=0;
        //     int sum =0;
        //     while (a<=10) {
        //         a=scanner.nextInt();
        //         sum += a;
        //         System.out.println(sum);
               
        //     }
            
        // question no.12 print the series

//          public static void main(String[] args) {

//             int start;
//             int stop;
//             int step;
//          Scanner scr=new Scanner(System.in);
//          System.out.println("Enter the starting number:");
//          start = scr.nextInt();
//          System.out.println("Enter the stop number:");
//          stop = scr.nextInt();
//          System.out.println("Enter the step number:");
//          step = scr.nextInt();
       
//         //  for (int i = start; i <= stop; i += step) {
//         //      System.out.print(i + " ");
//         //  }
//         for(int i = start; i <= stop; i += step) {
//             System.out.print((char)i + " ");
//         }
// }




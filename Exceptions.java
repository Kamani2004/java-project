 class Exceptions {


            // ArithmeticException
    // public static void main(String[] args) {
    //     try {
    //         int result = 10 / 0; 
    //     } catch (ArithmeticException e) {
    //         System.out.println("Error: Division by zero.");
    //     }
    //     finally{
    //         System.out.println("This will always execute");
    //     }
    //     System.out.println("Program continues...");
    // }
            // Array and ArithmeticException




    // public static void main(String[] args) {
    //     try {
    //         int arr[]={4,5,6,2};
    //         System.out.println(arr[7]);
    //     }
    //     catch (ArrayIndexOutOfBoundsException | ArithmeticException e){

    //         System.out.println("An error occurred: " + e.getMessage());
    //     }
    // }
            // Multiple Catch Blocks:
            public static void main(String[] args) {
                try {
                    int num[] = new int[5];
                    num[1] = 30; // ArrayIndexOutOfBoundsException
                    System.out.println(num[1]);
        
                    int result = 1000 / 25; // ArithmeticException
                    System.out.println("show the results="+ result);
                   }

                 catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array index out of bounds: " + e.getMessage());
                      } 
                catch (ArithmeticException e) {
                    System.out.println("Arithmetic error: " + e.getMessage());
                }
                finally{
                    System.out.println("This will always execute");
                }
            }
        


}

    


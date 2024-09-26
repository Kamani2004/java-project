public class res {

    // //print the reverse string
    public static void main(String[] args) {
        String originalStr = "Hello java";
        String reversedStr = "";
        System.out.println("Original string: " + originalStr);
            
        for (int i = 0; i < originalStr.length(); i++) {
          reversedStr = originalStr.charAt(i) + reversedStr;
        }
       
        System.out.println("Reversed string: "+ reversedStr);
      }
    
    // //print the reverse string 
    
    // public static void main(String args[]) {
    //     String str="Hello java vishal";
    //      String[] rr = str.split(" ");
    //      for(int i=rr.length-1;i>=0;i--){
    //          System.out.print(rr[i]+" ");
    //      }
       

   
    //     }
}


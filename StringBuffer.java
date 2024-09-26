
public class StringBuffer {
    public static void main(String[] args) {
   
     StringBuilder buffer1 = new StringBuilder("hello java in used different methods");
     System.out.println(buffer1);

     buffer1.append("code");
     System.out.println(buffer1);

     
     buffer1.insert(2,"java"); 
     System.out.println(buffer1);
     
     buffer1.reverse();
     System.out.println(buffer1);
     
     buffer1.delete(5, 11);
     System.out.println(buffer1);
     
     buffer1.replace(2, 6, "programming");
     System.out.println(buffer1);
     
     String str = "programming";

     buffer1.delete(5, 9); 
     System.out.println(buffer1); 

    
    } 
 }
 

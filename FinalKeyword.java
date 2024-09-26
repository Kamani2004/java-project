
class Parent{
    
    final int a = 50;
   void show(){
        System.out.println("This is Parent class");
    }
}
public class FinalKeyword extends Parent{
 void show(){
     System.out.println("This is FinalKeyword class");
 }
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show(); 
    }

}



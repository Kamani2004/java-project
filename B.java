
class A {
   
   public void add(int a,int b){
    int c=a+b;
    System.out.println("add=" +c);
   }
}
public class B extends A{
     
    public void sub(int a,int b){
          int c=a-b;                                                          
        System.out.println("sub=" +c);
    }
   public static void main(String[] args) {
B obj=new B();
    obj.add(12,2);
    obj.sub(45,12);
   }
} 
    


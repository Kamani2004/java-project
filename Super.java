class Parent{ 
    int a = 450;
  void show(){
       System.out.println("This is Parent class");
       System.out.println(a*2);
   }
}
public class Super extends Parent{

void show(){
    System.out.println("This is child class");
    super.show();
}
   public static void main(String[] args) {
       Parent obj = new Parent();
       obj.show(); 

   }

}



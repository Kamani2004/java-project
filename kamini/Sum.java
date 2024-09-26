
public class Sum {

    int a;
    int b;
    int Sum=a+b;
    
    void get(int a, int b) {
        System.out.println("Sum is: "+(a+b));
    }


    public static void main(String[] args) {
        Sum obj=new Sum();
        obj.get(14,45);
        
        
    }
}
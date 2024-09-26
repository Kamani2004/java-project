public class Inheri {
     
    // Parent class
    public class Student {
       String name;
       int rollNo;  
       
        }
    
public static void main(String[] args) {
    Inheri obj = new Inheri();
    Inheri.Student s1 = obj.new Student();
    System.out.println("first student data:-");
    s1.name = "Madhav";
    s1.rollNo = 101;
    System.out.println("Name: " + s1.name);
    System.out.println("Roll No: " + s1.rollNo);

    Inheri.Student s2=obj.new Student();
    System.out.println("Second student data:-");
    s2.name = "Nikhil";
    s2.rollNo = 102;
    System.out.println("Name: " + s2.name);
    System.out.println("Roll No: " + s2.rollNo);
    
}
}



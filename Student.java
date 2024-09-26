
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(Student student) {
        this.name = student.name; 
        this.age = student.age;  
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Rohan", 20); 
        Student student2 = new Student(student1);  

        System.out.println(student1); 
        System.out.println(student2); 
    }
}
abstract class Employee {
    private String name;
    private int id;
                                        // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }                                        // Abstract method
    abstract double getSalary();
                                        // Concrete method
public void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("Salary: $" + getSalary());
}
}

class Manager extends Employee {
    private double baseSalary;
    private double bonus;
                                                                    // Constructor
    Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id);                                       // Call the constructor of the abstract class
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    @Override
    double getSalary() {
        return baseSalary + bonus;
    }
}
class Developer extends Employee {
    private double baseSalary;
    private int hoursWorked;
    private double hourlyRate;

    Developer(String name,int id,double baseSalary,int hoursWorked,double hourlyRate){
        this.baseSalary=baseSalary;
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }
}
@Override
double getSalary()
 {
    return baseSalary + (hoursWorked * hourlyRate);
}


public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice Johnson", 101, 80000, 5000);
        Employee developer = new Developer("Bob Smith", 102, 60000, 120, 50);
        manager.printDetails();
        System.out.println();
        developer.printDetails();
    }
}











public class Employee {
    
}

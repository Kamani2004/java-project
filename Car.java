
public class Car {
    String model;
    int year;
    // Default constructor
     Car()
     {
        model = "Unknown";
        year = 2020;
    }
    // Parameterized constructor

     Car(String model, int year)
     {
        this.model = model;
        this.year = year;
    }

 public static void main(String[] args) {

     Car car = new Car();
    //  car.model = "Toyota";
    //  car.year = 2018;
     System.out.println("Car Model: " + car.model);
     System.out.println("Car Year: " + car.year);
     
     Car car1 = new Car("Honda", 2021);
     System.out.println("Car Model: " + car1.model);
     System.out.println("Car Year: " + car1.year);

   
 }


}



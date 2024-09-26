public class Incapsulation {
    private String  name;
    private int age;

    void getter(String name, int age) {
        this.name = name;
        this.age = age;
    }

  public static void main(String[] args) {
    Incapsulation obj = new Incapsulation();
    obj.getter("Kamini", 19);
    System.out.println("Name: " + obj.name);
    System.out.println("Age: " + obj.age);
                                                                            
    
  }

}

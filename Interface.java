interface Animal{
    void walk();
}
interface herbivores{
  
}

class Horse implements Animal,herbivores{
    public void walk(){
        System.out.println(" Horese walk on 4 legs");
        System.out.println("Horse color is brown");
    }
}
public class Interface {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();
    }
    
}

 abstract class Animal{
    abstract void walk();
}

class Horse extends Animal{
    public void walk(){
        System.out.println("walk on 4 legs");
        System.out.println("it's large animal ");
    }
}
class Chicken extends Animal{
    public void walk() {
        System.out.println("walk on 2 Legs");
        System.out.println("it's small animal ");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Horse horse =new Horse();
        horse.walk();
        Chicken chicken=new Chicken();
        chicken.walk(); 
    }
    
}

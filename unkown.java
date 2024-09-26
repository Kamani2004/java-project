public class unkown {
    public static void main(String[] args){

    }
       
            // Private fields
            private String name;
            private int age;
            // Constructor
            public unkown(String name, int age) {
                this.name = name;
                System.out.println(name);
                this.age = age;
                System.out.println(age);
            }
            // Getter for name 
            public String getName() {
                return name;
            }
            // Setter for name
            public void setName(String name) {
                this.name = name;
            }
            // Getter for age
            public int getAge() {
                return age;
            }
            // Setter for age
            public void setAge(int age) {
                if (age > 0) {
                    this.age = age;
                } else {
                    System.out.println("Age must be positive.");
                }
            }
        }
    

        
public class ParameterizedConstructor {

    public static void main(String[] args) {
  
    constructor obj = new constructor("Aryan", 25);

    }

}

class constructor{
    String name;
    int age;
    // Parameterized constructor
    constructor(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
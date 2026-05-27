package OOPsTelusku;

class Human{
    private int age; // Instance variable
    private String name;

    // Constructor has the same name as the class name
    // it doesn't have a return type like int, float, void , string, etc
    // if we don't call constructor it will still be called, everytime we create an object constructor will be called
    public Human(){
        age = 12;
        name = "John";
//        System.out.println("In Constructor");
    }
    // The constructor above is default constructor
    // The constructor below is a Parameterised constructor
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }


    // We have our data here which is private but how do we access it?
    // We can access it by making methods
    // We made Getter Function
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    // Setter Function
    public void setAge(int age){
        this.age = age;
    }
    // this keyword creates and object of the Human obj and sends it to the setAge() or setName()
    // so that we can differentiate between the local variable age (function wala)
    // and the instance variable age (Class wala)
    public void setName(String name) {
        this.name = name;
    }
}
public class encapsulationInJava {
    public static void main(String[] args) {

        Human obj = new Human();
        System.out.println(obj.getName() +" : "+ obj.getAge()); // null : 0
        obj.setAge(21);
        obj.setName("Harsh");
//        Human obj1 = new Human();
        System.out.println(obj.getName() +" : "+ obj.getAge()); // Harsh : 21
        // We are creating an object but then later assigning the values to it,
        // what should we do if we want to initialise the values as soon as we declare the object
        // Here is where constructor comes in
        // it doesn't have a return type like int, float, void , string, etc
        // if we don't call constructor it will still be called, everytime we create an object constructor will be called
//    If we have 2 objects - obj and obj1 then it means it will call constructor are called 2 times

        // Parameterised Constructor
        Human obj1 = new Human(21, "Chandana");
        System.out.println(obj1.getName()+" : "+obj1.getAge());
        // Initialised values in the constructor itself
    }
}

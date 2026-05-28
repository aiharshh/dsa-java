package OOPsTelusku;
class Anon {
    public Anon(){
        System.out.println("Object Created");
    }
    public void show(){
        System.out.println("Shown A");
    }
}


public class anonymousObject {
    public static void main(String[] args) {
//        A obj = new A(); // is this line compulsory or do we have a shortcut
        // obj is a reference variable
        // new A() is the object created
//        A obj;
//        obj = new A(); // new A(); will actually create an object
//        obj.show();
        // The major thing is that we have to
        new Anon(); // This will create a new object in the Heap Memory directly and without creating reference in Stack
        // this types of objects are called as Anonymous Object because they don't have a name
        // There is no reference for this object.
        // We can't reuse this Anonymous Objects.
        new Anon().show();
        // Reuse this line then see what happens
        new Anon().show();
        // We are getting "Object created" this means that the object has been created 2 times.
    }
}

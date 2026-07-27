package OOPsTelusku;

// There are 4 types of Access Modifiers, -> public, private, ,protected and default
// public - accessible everywhere
// private - accessible in the same class
// int marks; === default int marks;
// protected access modifier

// we can access the protected in the subclass
// say we have class A and C
// we can't access it anywhere but only we can access in the subclass check this out


class AA{
    protected int marks = 10;
}
// Protected can be accessed in the same class, Same Package subclass, same package non subclass, and diff pacakge subclass
// protected cannot be accessed in different package non-subclass
class CC extends AA {
    public void show() {
        System.out.println(marks);
        // CC extends AA so we can simply access the marks in the CC
    }
}

public class accessModifiers {
    public static void main(String[] args) {
        AA obj = new AA();
        CC obj2 = new CC();
        obj2.show();
    }
}

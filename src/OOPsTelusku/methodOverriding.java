package OOPsTelusku;

class DaddysPhone {
    public void phone(){
        System.out.println("Daddy's Phone - Nokia");
    }
}

class SonsPhone extends DaddysPhone {
    public void phone(){
        System.out.println("Son's Phone - iPhone");
    }
}

// Here we have 2 functions with same name that is 'phone'
// Now we have made an object of the SonsPhone, Daddy had given his phone to his son but after few years
// son got his own mobile
// So Son is asked about his mobile, what will he say?
// He will say he has an iPhone as he has it even tho he also has Nokia. He will give preference to His phone
// rather than daddy's phone

// Similarly here what happens is, Son has his own object and he has to call his function phone
// so what will he call?
// he will call the phone from his class and not his Daddy's class

// This is what is method overriding okay

//and method overloading is something in which the two method names are same in the same class but has differnt parameters

public class methodOverriding {
    public static void main(String[] args) {
        SonsPhone obj = new SonsPhone();
        obj.phone();
    }
}
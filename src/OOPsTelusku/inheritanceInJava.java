package OOPsTelusku;
class AdvancedCalc extends Calc{ // now this extends AdvCalc to add and sub both aswell with mult and div
    // Now we have advanced calculator, now we have to simply add few more functions other than calc functions
    // that already exists
    public int mult(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
}
// We made a calculator already now we want to add other features to it and now we will make an advanced calc
class Calc{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}
public class inheritanceInJava {
    public static void main(String[] args) {
        Calc obj = new Calc();
        AdvancedCalc obj1 = new AdvancedCalc();
        System.out.println(obj1.add(5, 7));
        System.out.println(obj1.sub(7, 5));
        System.out.println(obj1.mult(5, 7));
        System.out.println(obj1.div(7, 5));
        VeryAdvancedCalc obj2 = new VeryAdvancedCalc();
        System.out.println(obj2.power(4,2));
    }
}
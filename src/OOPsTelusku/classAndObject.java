package OOPsTelusku;

class Calculator{
    public int add(int n1, int n2){
        return n1+n2;
    }
}
public class classAndObject {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        int nums1 = 4, nums2 = 5;
        System.out.println(calc.add(nums1, nums2));
    }
}

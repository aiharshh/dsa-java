package recursion;

public class subsets {
    public static void printSubsets(int i, String s, String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(i);
        printSubsets(i+1,s,ans+ch); // we will add the characters
        printSubsets(i+1,s,ans); // we won't add the characters
    }
    public static void main(String[] args) {
        String s = "abcd";
        printSubsets(0, s, "");
    }
}

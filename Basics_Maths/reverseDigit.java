package Basics_Maths;

public class reverseDigit {

    static int reverse(int n){
        int rev = 0;
        int m = n;
        int rem;
        while(m!=0){
            rem = m%10;
            rev = rev*10 + rem;
            m/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int n = 34152;
        int rev_n = reverse(n);
        System.out.println(rev_n);
    }
}

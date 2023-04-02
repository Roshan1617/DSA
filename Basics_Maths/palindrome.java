package Basics_Maths;

public class palindrome {

    static boolean is_pal(int n){
        int m = n;
        int rev = 0;
        while(m!=0){
            rev = rev*10 + m%10;
            m/=10;
        }
        if(rev == n) return true;
        return false;
    }
    public static void main(String[] args) {
        int n = 123454321;
        System.out.println(is_pal(n));
    }
}

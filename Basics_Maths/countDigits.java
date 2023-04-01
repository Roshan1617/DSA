package Basics_Maths;

// import java.util.*;
public class countDigits { 
    static int count_digits_1(int n)
    {
        int num = n;
        int count = 0;
        while(num != 0){
            num /= 10;
            count++;
        }
        return count;
    } 

    static int count_digits_2(int n)
    {
        String str = Integer.toString(n);
        return str.length();
    } 

    static int count_digits_3(int n)
    {
        int count = (int) Math.log10((int) n) + 1;
        return count;
    } 

    

    public static void main(String args[]) 
    { 
        int n = 100000;
        System.out.println("Number of digits in "+n+" is "+count_digits_3(n));
    } 
}
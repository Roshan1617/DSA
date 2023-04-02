package patterns;

/* 

    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *


*/


public class Pattern_9 {

    static void printPattern(int n){
        // upper half
        for(int i=0;i<n;i++){
            // space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            // stars
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            // stars
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            System.out.println();
        }

        // lower half
        for(int i=0;i<n;i++){
            // space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            // stars
            for(int j=0;j<2*n - 2*i - 1;j++){
                System.out.print("*");
            }

            // stars
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println();

        int n = 5;
        printPattern(n);

        System.out.println();
    }
}

package patterns;

/*

    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

 */

public class Pattern_10 {

    static void printPattern(int n){
        // upper half
        for(int i=0;i<n;i++){
            // space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            // characters
            char ch = 'A';
            for(int j=0;j<2*i+1;j++){
                System.out.print(ch);
                if(j<(2*i+1)/2) ch++;  // till half of the j there is a increment
                else ch--;             // afterwards decrement
            }

            // stars
            for(int j=0;j<n-i-1;j++){
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

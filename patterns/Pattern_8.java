package patterns;

/*

*********
 *******
  *****
   ***
    *    
 
*/

public class Pattern_8 {

    static void printPattern(int n){

        for(int i=0;i<n;i++){
            // space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            // stars
            for(int j=0;j<2*(n-1-i)+1;j++){
                System.out.print("*");
            }

            // space
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

/* 

rows ->     columns
        space stars space
0         0     9     0
1         1     7     1
2         2     5     2
3         3     3     3
4         4     1     4

i         i 2*(n-1-i)+1 1

*/
package patterns;

/*

    *
   ***
  *****
 *******
*********   
    
 
  */

public class Pattern_7 {

    static void printPattern(int n){

        for(int i=0;i<n;i++){
            // space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            // stars
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            // space
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

/* 

rows ->     columns
        space stars space
0         4     1     4
1         3     3     3
2         2     5     2
3         1     7     1
4         0     9     0

i       n-i-1 (2*i)+1 n-i-1

*/
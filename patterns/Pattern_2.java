package patterns;

/*

  *
  **
  ***
  ****
  *****
 
  */

public class Pattern_2 {

    static void printPattern(int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
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

rows -> columns
0       1 star
1       2 star
2       3 star
3       4 star

n-1     n star

*/
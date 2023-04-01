package patterns;

/*

  *****
  ****
  ***
  **
  *
 
  */

public class Pattern_5 {

    static void printPattern(int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
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
0       n star
1       n-1 star
2       n-2 star
3       n-3 star

n-1     n - (n - 1) star
n       n - (n) star

*/
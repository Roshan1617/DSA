package patterns;

/*

  1
  1 2
  1 2 3 
  1 2 3 4
  1 2 3 4 5
 
  */

public class Pattern_3 {

    static void printPattern(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
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
1       1
2       1 2
3       1 2 3
4       1 2 3 4

n-1     1 2 3 4 ... n-1
n       1 2 3 4 ... n-1 n

*/
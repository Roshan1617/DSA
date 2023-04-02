package patterns;

/*

  5
  
  1 2 3 4 5
  1 2 3 4
  1 2 3 
  1 2
  1
 
  */

public class Pattern_6 {

    static void printPattern(int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(j+1);
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
1       1 2 3 4 5 .... n
2       1 2 3 4 5 .... n-1
3       1 2 3 4 5 .... n-2
4       1 2 3 4 5 .... n-3

n-1     1 2 3 4 ... n-(n-1)-1
n       1 2 3 4 ... n-1 n

*/
package patterns;

/*

  *****
  *****
  *****
  *****
  *****
 
  */

class Pattern_1{

    static void printPattern(int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println();

        printPattern(n);
        
        System.out.println();
    }
}

/*

rows -> columns
0         n stars
1         n stars
2         n stars
3         n stars

nth       n stars

*/
package patterns;

public class Pattern_11 {

    static void printPattern(int n){
        // stars
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
        
        // space
            for(int j=0;j<2*i;j++){
                System.out.print(" ");
            }
        
        // stars
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
        
            System.out.println();
        }

        // --------------------------------------------

        // stars
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
        
        // space
            for(int j=0;j<2*n-2*i-2;j++){
                System.out.print(" ");
            }
        
        // stars
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
        
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n =5;
        printPattern(n);
    }
}

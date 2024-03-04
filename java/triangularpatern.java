import java.util.Scanner;
public class triangularpatern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // downward triangular
        System.out.println(" enter the row ");
        int r = sc.nextInt();
        for (int i =1; i <=r; i++ ){
            for( int j = 1; j<= i ; j++){
                System.out.print("*");
            } 
            System.out.println();
    
           } 
           // upward triangular 
           

           for(int i = 1; i<= r; i++ ){
            for(int j = 1; j<= (r+1-i);j++){
                System.out.print("*");
            }
            System.out.println();
           }

    }
    
}

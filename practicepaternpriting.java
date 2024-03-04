import java.util.Scanner;
public class practicepaternpriting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the row ");
        int r = sc.nextInt();
        // System.out.println(" enter the coloum");
        // int c = sc.nextInt();

        // for(int i = 1 ; i<=r; i++){
        //     for( int j =1; j<= c; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // // }
        // for(int i = 1 ; i<=r; i++){
        //     for( int j =1; j<= c; j++){
        //         if(i==1 ||i==r|| j==1||j==c){
        //         System.out.print("*");
        //       } else  
        //       System.out.print( "  ");
        //     }
        //     System.out.println();
        // } 
        //triganular pattern
       for (int i =1; i <=r; i++ ){
        for( int j = 1; j<= i ; j++){
            System.out.print("*");
        } 
        System.out.println();

       }

        
    }
    
}

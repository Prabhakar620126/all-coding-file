import java.util.Scanner; 
public class loops { 
    // types of loops 1. while loop
        //2. for loop  3. do-while loop
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        //while loop
        // int sum = 0;
        // print n number 
        // int num = 1;
        // while (num<=n){
        //     System.out.println(num);
            
        //     num++;
        // }
        // int sum= 0;

        // int num = 1;
        // while (num<=n){
        //    sum = sum +num;
        //   num++;
        // }
        // System.out.println(sum);
        
        // for loop 
        // print n number
        // for( int num = 25; num<=n; num++) {
        //     System.out.println(num);
        // }
        // sum of n number
        // int sum= 0; 

        //  for( int num = 1; num<=n; num++) {
        //     sum = sum+ num;
        // }
        // System.out.println("sum of number "+sum);
        //reverse order 
        // for( int num = n ; num>=1; num+=2) {
        //     System.out.println(num);
        // }
        // do- while loop
        int num = 1 ;
        do {
            System.out.println(num);
            num++;
        } while(num<=n);


        
    }
    
}

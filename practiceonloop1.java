import java.util.Scanner;
public class practiceonloop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
         //int num = 0;
         //int original_n = n;
        // counting of digit of number 
        
        // while(n>0){
        //     n =n/10;
        //     num++;
        // }
        //     System.out.println("number of digit  "+ original_n + " = " +num);
        // sum of digit of number 
        // while(n>0){
        //     num += n%10;
        //     n= n/10;
            
           

        // }
        // System.out.println( "the sum of the number  " + original_n + " = "  + num);

         // reverse of a number
        //  while (n>0){
        //     num =((num *10) +(n%10));
        //     n= n/10;

        //  }
        //  System.out.println("the reverse order of the number is " + original_n + " = "+ num);
        // 1+2-3+4-5.. patern odd sub even add
        // int i = 1;
        // while (i <=n ){
        //     if (i % 2==0){
        //         num -= i;
        //     } else {
        //         num += i;
        //     } 
        //     i++;
        // }
        // System.out.println( num );  
        // for(int i= 1 ; i<= n ; i++){
        //     if (i%2 == 0) {
        //         num -=i;
        //     } else {
        //         num+= i;
        //     }
        // } 
        // System.out.println( num);
       // factoril 
    //    int fact = 1;
    //    for (int i = 1;i <=n ; i++){
    //     fact = fact * i;
    //     System.out.println( "factorial of " + i+ ": " +fact);
    //    } 
       //given 2 number a and b . find  a raise to the power b 
       System.out.println( "enter the number that is at the power ");
       int b =sc.nextInt();
       int num = 1;
       for (int i=1 ; i <=b ; i++){
        num *=n ; 
       }
       System.out.println( "the n to the power of b  is " +num);

        
    }
    
}

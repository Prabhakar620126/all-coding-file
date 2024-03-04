import java.util.Scanner;
public class assigmentoperator {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        //// Q1 - writea program to add 8 to the number x and then divide it by 3. now  the modulus of the quotient is taken with 5 and then multiply the resultant value by 5 .display the final result.
        //(x+8) /3 %5*5 
        // System.out.println("enter the number");
        // int x = scn.nextInt();
        // System.out.println(((x+8)/3)%5*5);

        // Q 2-swap two numbers without the use of third variable
    //     System.out.println(" enter the frist number ");
    //     int p = scn.nextInt();
    //     //System.out.println(" the frist number before swap is  " + p);
    //     System.out.println(" enter the second number ");
    //     int q = scn.nextInt();
    //    // System.out.println("the second number before swap   is " +q);
    //      p = p + q;
    //      q= p -q;
    //      p = p-q;
    //      System.out.println("the swap frist number is " +p);
    //      System.out.println("the swap second number is " +q);

         //Q3-  write a program to calculate the sum of the  digits of 3 digit number .
        //  System.out.println("enter the number" );
        //   int x = scn.nextInt();
        //   int sum = 0;
        //   while(x>0){
        //     sum += x%10;
        //     x/=10;
        //   }
        //   System.out.println(sum);

          //Q4- assign values of variable 'a' and 'b' as 55 and 70 respectively and then check if : i) both the condition 'a<50' and 'a<b'  are true   ii)at least one of the condition 'a<50' 'a<b' is true.
        //   System.out.println(" enter the value of a");
        //   int a = scn.nextInt() ;
        //   System.out.println("enter the value of b");
        //   int b = scn.nextInt();
        //   System.out.println( a<50 && a<b);
        //   System.out.println(a<50 || a<b);

          // Q5 - find the total number of bits needed to be flipped to convert x to y .
          
        int x = scn.nextInt();
        int y = scn.nextInt();
        int n = x ^ y;
        int count = 0;
        while( n!=0 ){
            n = n & (n-1);
            count++;
        }
        System.out.println(count);

        
          


    }
    
}

import java.util.Scanner;
public class asiproblemonloop {
    public static void main(String[] args) {
        Scanner ps= new Scanner(System.in);

        // Q1- Write a program to print Fibonacci series of n terms where n is input by use
        // int n = ps.nextInt();
        // int a= 1; // initial 2 element are 1 and 1
        // int b=1;
        // for(int i = 1; i<=n; i++){
        //     System.out.print(a+" ");
        //     int sum = a+b ; // calculating every 3rd element in the series by summing up perious 2 
        //     a = b ; // update perious value to next element 
        //     b = sum;
    //}
             
            // Q2- Write a program to enter the numbers till the user wants, the number can be positive, negative or zero. Calculate the sum of numbers until a negative number is encountered. If the input is a negative number, current sum is discarded and print -1.
            System.out.println(" enter the number");
            int sum  = 0;
            while (ps.hasNextInt()){ // check if input exists or not 
                int num = ps.nextInt();
                if (num >= 0 ){ //if input is positive  or zero add it to the current sum 
                    sum += num;
                }
                else{
                    sum = -1; // input is negative so change sum to -1 and break out of tne loop
                    break;
                }
            }
            System.out.println(sum);

            //Q3- Write a program to calculate the factorial of a number
            
    }   
}

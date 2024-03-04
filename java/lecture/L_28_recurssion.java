//package lecture;
import java.util.Scanner;

public class L_28_recurssion {
    static int factorial(int n){
        // base case
        if(n==0) return 1;
        
        int ans = n*factorial(n-1);
        return ans;

    }
    static int fibonacci(int n ){
        if(n==0|| n==1) return n;
        int ans = fibonacci(n-1) + fibonacci(n-2);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.println("enter the number");
        int n= sc.nextInt();
        //System.out.println(factorial(n));
        for(int i=0; i<=10; i++){
            System.out.println(fibonacci(i));
        }
        System.out.println(fibonacci(n));
        
    }
}

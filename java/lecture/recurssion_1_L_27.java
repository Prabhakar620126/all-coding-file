import java.util.Scanner;
public class recurssion_1_L_27 {

    static void printincreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        printincreasing(n-1);
        System.out.println(n);
    }
    static void printdecreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printdecreasing(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int x= sc.nextInt();
        //printincreasing(x);
        printdecreasing(x);
    }
}

/*
 * recursion is self calling of method with different parameter and a base case to determinate the infinite loop 
 * in recurrsion we solve a bigger problem by smaller subproblem
 */
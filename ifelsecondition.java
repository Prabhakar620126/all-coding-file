import java.util.Scanner;

public class ifelsecondition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num1 = sc.nextInt();
        // if(num1 %2 ==0){
        //     System.out.println("number is even");
        // }
        // else {
        //     System.out.println("the number is odd");
        // }

        // ternary operator
        String ans;
        ans =(num1 %2==0)?"even" :"odd";
        System.out.println(ans);




        
    }
    
}

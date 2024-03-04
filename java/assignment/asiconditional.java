import java.util.Scanner;
public class asiconditional { 
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        //Q1- Write a program which takes the values of length and breadth from user and check if it is a square or not
        System.out.println("enter the length ");
        int length = pk.nextInt();
        System.out.println(" enter the breadth");
        int breadth = pk.nextInt();
        if (length == breadth){
            System.out.println(" this is Squqre");
        }else {
            System.out.println(" this is rectangle");
        }

        //Q2- Write a program to print absolute value of a number entered by the user
        System.out.println(" enter the number that is print absulate value");
        int value = pk.nextInt();
        if(value >=0){
            System.out.println("the absoulate value is ; " +value);
        }
        else{
            System.out.println("the absoulate value is ; " +(-1*value));
        }

        //Q3- Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and calculate Profit or Loss.
        System.out.println(" emter the cost price");
        int c_p = pk.nextInt();
        System.out.println(" enter the selling price");
        int s_p = pk.nextInt();
        if (c_p>=s_p){
            System.out.println("loss : " +(c_p-s_p));
        }else{
            System.out.println("profit : " + (s_p - c_p));
        }

        //Q4- Write a program to print positive number entered by the user, if user enters a negative number, it is skipped
        System.out.println(" enter the positive number ");
        int number = pk.nextInt();
        if (number >0){
            System.out.println(" the positive number is : " + number);

        }else {
            System.out.println("the number is negative and Skipped");
        }

        // Q5-  Create a calculator using switch statement to perform addition, subtraction, multiplication and division.
        System.out.println(" enter the frist number ");
        Double p= pk.nextDouble();
        System.out.println(" enter the second number ");
        Double q= pk.nextDouble();
        System.out.println("enter the operator :  (+ ,- ,* or /)");
        char ch = pk.next().charAt(0);
         switch(ch){
            case '+':
            System.out.println(" the sum of "+ p +" and " +q + " is : "+ (p+q)) ;
            break;
            case '-':
            System.out.println(" the difference of "+ p +" and " +q + " is : "+ (p-q)) ;
            break;
            case '*':
            System.out.println(" the product of "+ p +" and " +q + " is : "+ (p*q)) ;
            break;
            case '/':
            System.out.println(" the dividet of "+ p +" and " +q + " is : "+ (p/q)) ;
            break;
            default:
            System.out.println(" Error ! The operator is not correct");
            break;

         }

         // Q6- - Write a program to calculate marks to grades . Follow the conversion rule as given below : 
         System.out.println(" enter the marks out of hundred ");
         Double k = pk.nextDouble();
         if( k >=90){
            System.out.println(" grade is A+");
         } else if( k >=80){
            System.out.println(" grade is A");
         } else if (k>=70){
            System.out.println(" grade is B+");
         } else if (k>=60){
            System.out.println(" grade is B");
         } else if (k>=50){
            System.out.println("grade is C");
         }else if (k>=40){
            System.out.println(" grade is D");
         }else if (k>=30){
            System.out.println("grade is E");
         }else if (k<30){
            System.out.println(" fail");
         }
         else {
            System.out.println("enter number is invalid");
         }

    }
    
}

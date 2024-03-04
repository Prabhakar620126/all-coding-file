 //package assignment;
import java.util.Scanner;
public class assiinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        //Q1 - Input name, roll number and field of interest from user and print in the format below :Name: xyz, Roll number: xyz, Field of interest: xyz 
        System.out.println("enter the name roll  and interst");
        String frist_name = sc.next();
        String last_name = sc.next();
        int roll = sc.nextInt();
        String interest = sc.next(); 
        System.out.println("Name : "+frist_name +" " +last_name);
        System.out.println("Roll Number : "+roll);
        System.out.println("Field of interest : "+interest );

        //Q2- Input two different string and print them in same line
        System.out.println("Enter two different String ");
        String one = sc.nextLine();
        String two = sc.nextLine();
        System.out.println(one + two);

        //Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of 100), write a program to calculate his total marks and percentage marks.

        System.out.println(" enter the mark of subject");
        int subject_1 = sc.nextInt();
        int subject_2 = sc.nextInt();
        int subject_3 = sc.nextInt();
        int total_mark = (subject_1 + subject_2 + subject_3);
        double percentage_mark =(total_mark)/3;
        System.out.println(" Total Marks : " +total_mark);
        System.out.println("Percentage marks : " +percentage_mark+ "%");

        //Q4 - Given two numbers, return their sum in the following format:Int t representing number of test cases T lines of Two integers representing the numbers to be added
        System.out.println(" Enter the value of t");
        int t = sc.nextInt();
        for(int i = 1; i<=t ; i++){
            System.out.println(" enter  a");
            int a= sc.nextInt();
            System.out.println("enter b");
            int b = sc.nextInt();
            System.out.println( "the sum of "+a+" and " +b+ "is : " + (a+b));
        }

        //Q5 - Given few lines of input(number of lines unknown) where each line has two strings, concatenate the strings
        while(sc.hasNextLine()){
            System.out.println("enter the frist string");
            String p = sc.next();
            System.out.println(" enter the second string");
            String q = sc.next();
            System.out.println(p+q);
        }     
    }
    
}

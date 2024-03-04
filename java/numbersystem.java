import java.util.Scanner;
public class numbersystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // conversion of binary to desimal
        System.out.println(" enter the binary number ");
        int binary_num = sc.nextInt();
        int decimal = 0; // converted decimal number 
        int power  = 1 ; // power of two 2^0 = 1 
        while(binary_num >0 ){
            int unit_digit = (binary_num % 10) ;
            decimal+=(unit_digit *power) ;
            binary_num /= 10;
            power *= 2;

        }
        System.out.println(decimal);

        // conversition of desimal into binary
        System.out.println(" enter the desimal number ");
        int des = sc.nextInt();
        int binary = 0 ; //binary number 
        int pw = 1 ; //10^0 = 1 
        while (des>0 ){
             int parity =des % 2;
             binary += (parity * pw);
             pw *= 10 ;
             des /= 2;


        }
        System.out.println(binary);
        
    }
    
}

import java.util.Scanner;
public class L_31_recrssion {
    static int gcd(int x , int y ){
        if(y==0) return x;
        return gcd(y, x%y);

    }
    
    static int gcd1(int x , int y){
        while(x% y != 0){
            int rem = x%y;
            x=y;
            y= rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("enter the number");
        int x= sc.nextInt();
        System.out.println("enter the second number");
        int y= sc.nextInt();
        int hcf = gcd1(x, y);
        System.out.println(hcf);
        System.out.println(gcd(x, y));
        int lcm = (x*y)/hcf;
        System.out.println(lcm);
        
    }
    
}

/*
 * euclid's algorithm
 * gcd(x,y)=gcd(y,x%y);
 * gcd(x,y) = x ;
 */

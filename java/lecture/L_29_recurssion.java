import java.util.Scanner; 
public class L_29_recurssion {
static int sum(int n){
    if(n>=0 && n<= 9){
        return n;
    }
    return sum(n/10)+ n%10;
}
static int number(int n){
    if(n>=0 && n<= 9){
        return 1;
    }
    return number(n/10)+ 1;
}
static int power(int n, int m){
    if(m==0)return 1;
    return power(n, m-1) *n;
}
static int pow(int n, int m){
    if(m==0)return 1;
    int smallpow =pow(n, m/2);
    if(m%2==0){
        return smallpow* smallpow;
    }
    return n*smallpow*smallpow;
    
}

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the number :");
        int n = sc.nextInt();
        // sum of all digit of a number 
        //System.out.println(sum(n));
        //System.out.println(number(n));
        System.out.println(" enter the power");
        int m = sc.nextInt();
        System.out.println(power(n, m));
        System.out.println(pow(n, m));


        
    }
}

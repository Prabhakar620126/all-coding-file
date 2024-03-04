import java.util.Scanner;
public class L_30_recurrsion {
    static int seriessum(int n){
         if(n==0) return 0;
         if(n%2==0){
            return seriessum(n-1)-n;
         }
         else{
            return seriessum(n-1) +n;
         }
    }
    static void multiple(int n, int k){
        //base case 
        if(k==1){ 
            System.out.print(n+ " ");
            return;
        }
        //smaller work
        multiple(n, k-1);
        System.out.print(n*k +" ");
        return ;
        

     }
     static int seriessum1(int n){
        if(n==0)return 0;
        return seriessum1(n-1) +n;
     }

      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for multiplication");
        int n= sc.nextInt();
        System.out.println(" enter the number upnto which multiplication ");
        int k= sc.nextInt();

        //multiple(n, k);
        System.out.println(seriessum1(n));
        System.out.println(seriessum(n));
    }
}

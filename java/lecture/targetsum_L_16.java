import java.util.Scanner;
public class targetsum_L_16 {
    static int reaptingnumber( int[] arr){
        int n= arr.length;
        for(int i=0; i<n; i++){
            for(int j= i+1; j<n; j++){
                if(arr[i]== arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    static int secondmax(int[]arr){
        int max= Integer.MIN_VALUE;
        int n= arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]> max){
                max= arr[i];
            }
        }for(int i =0; i<n;i++){
            if (arr[i]==max){
                arr[i]= Integer.MIN_VALUE;
            }

        }
        int smax= Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]> smax){
                smax= arr[i];
            }
        }

        return smax;

    }
    static int findunique( int[] arr){
        int n= arr.length;
        for(int i=0; i<n; i++){
            for(int j= i+1; j<n; j++){
                if(arr[i]== arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;

                }
            }
        }
        int ans = -1  ;
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                ans = arr[i];

            }
        }
        return ans;
    }
    static int tripletsum(int [] arr , int target){//count the number of triple whose sum is equal to the given target 
        int ans =0;
        int n= arr.length;
        for(int i =0 ; i<n ; i++){
            for(int j=i+1 ;j<n ;j++){
                for(int k =j+1; k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;

                    }
                }

            }
        }
        return ans;

    }
    static int pairsum(int[] arr ,int target){//find the total number of pairs in the array  whose sum is equal to the given target 
        int n = arr.length;
        int ans =0;
        for(int i = 0;i<n;i++){
            for(int j= i+1; j<n ;j++){
                if(arr[i]+ arr[j]==target){
                    ans++;
                }
            }
        }
        return ans ;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int [] arr =new int[n];
        System.out.println(" Enter the  "+ n +" element of array");
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the target sum :");
        int target= sc.nextInt();
        //System.out.println( pairsum(arr, target));
        //System.out.println(tripletsum(arr, target));
        //System.out.println("unique element :" +findunique(arr));
        System.out.println("second maximum element is "+ secondmax(arr));

        System.out.println("reapting number "+reaptingnumber(arr));





    }
    
}

import java.util.Scanner;

public class twopointer_L_18 {
    static void reverse(int[] arr , int i, int j){
        //int i=0, j= arr.length-1;

        while(i<j){
            swapinarray(arr, i, j);
            i++;
            j--;
            

        }
    }
    static int[] sortsquare(int[] arr){
        int n = arr.length;
        int left =0 , right =n-1;
        int[] ans = new int[n];
        int k=n-1;
        while(left<=right ){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k--] = arr[left]* arr[left];
                left++;
            }else{
                ans[k--]= arr[right]*arr[right];
                right--;
            }

        }
        printarray(ans);
        return ans;
    }

    static void sortarraybyparity(int[] arr){
        int n = arr.length;
        int left =0 , right =n-1;
        while(left<right ){
            
            if(arr[left]%2!=0 && arr[right]%2==0){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
                 left++;
                 right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;
            }
            
        }
        printarray(arr);
    }
    static void  swapinarray(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    static void sortZeroAndOne(int[] arr){
        int n= arr.length;
        int zeroes=0;
        // count of zeroes
        for(int i=0; i<n ; i++){
            if(arr[i]==0){
                zeroes++;
            }
        }
        // 0 to zeroes-1 : 0, zeroes to n-1 : 1
        for(int i=0; i<n; i++){
            if(i<zeroes){
                arr[i]= 0;
            }else{
                arr[i]=1;
            }
        }
    }
    
    static void printarray(int[] ans){
        for(int i=0 ;i<ans.length; i++){
            System.out.print( " "+ ans [i]);
        }
        System.out.println();
    }
    static void sort(int[] arr){
        int n = arr.length;
        int left =0 , right =n-1;
        while(left<right ){
            
            if(arr[left]==1 && arr[right]==0){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
                 left++;
                 right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
            
        }
        printarray(arr);
    }
        
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size ");
        int n = sc.nextInt();
        int[] array =new int[n];
        System.out.println(" enter the "+n+"  element ");
        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        System.out.println("original array");
        printarray(array);
        //  sortZeroAndOne(array);
        // System.out.println(" sorted array ");
        // printarray(array);
        // sort(array);
        // System.out.println("sort array");
        // printarray(array);
        //sortarraybyparity(array);
        sortsquare(array) ;
        reverse(array, 0, n);

        printarray(array);
        

        
    }
    
}

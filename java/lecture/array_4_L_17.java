import java.util.Scanner;

public class array_4_L_17 {
static int[] makeFrequencyarray(int[] arr){
    int[] freq = new int[100005];

    for(int i =0 ; i<arr.length; i++){
        freq[arr[i]]++;
    }
    return  freq;

}

    static int [] rotate(int[] arr, int k){
        int n= arr.length;
        k= k%n;
        int[] ans= new int[n];
        int j=0;
        for(int i=n-k;i<n; i++){
            ans[j++] = arr[i];
        }
        for(int i=0; i<n-k;i++){
            ans[j++] = arr[i];
        }
        printarray(ans);
        return ans;
    }
    static void  swapinarray(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;

    }
    static void reverse(int[] arr , int i, int j){
        //int i=0, j= arr.length-1;

        while(i<j){
            swapinarray(arr, i, j);
            i++;
            j--;
            

        }
        
    }
    static void swap2(int a, int b){
        System.out.println("original value  before swap ");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
        a= a+b;
        b= a-b;
        a = a-b;
         System.out.println(" value after  swap ");
        System.out.println("a :"+a);
        System.out.println("b :"+b);

    }
    static void swap(int a, int b){// with extra variable
        System.out.println("original value  before swap ");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
        int temp = a;
        a= b;
        b= temp;
        System.out.println(" value after  swap ");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }
    static int[] reversearray(int[] arr){
        int n= arr.length;
        int j=0;
        int[] ans = new int[n];
        for(int i=n-1;i>=0; i--){
            ans[j++]= arr[i];
            

        }
        return ans;

    }
    static void printarray(int[] ans){
        for(int i=0 ;i<ans.length; i++){
            System.out.print( " "+ ans [i]);
        }
        System.out.println();
    }
    static void rotateinplace(int[] arr , int k){
    int n= arr.length;
    reverse(arr, 0 , n-k-1);
    reverse(arr, n-k, n-1);
    reverse(arr, 0, n-1);
    printarray(arr);
    
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int  a =9;
        int b = 3;
        int [] arr = {1,2,3,4,5,6};
        // System.out.println("swaping with third variable");
        // swap(a, b);
        // System.out.println("swaping without third variable ");
        // swap2(a, b);
        // System.out.println(" original array ");
        // printarray(arr);
        // System.out.println("reaversing the array with extra variable ");
        
        // int[] ans= reversearray(arr);
        // printarray(ans);
        // System.out.println("reaversing the array without extra variable ");
        // reverse(arr);
        // printarray(arr);
        // printarray(arr);
        // System.out.println("Enter the  rotation number ");
        // int k = sc.nextInt();
        // rotate(arr, k);
        // System.out.println(" rotate in plece");
        // rotateinplace(arr, k);
        System.out.println("Enter the array size ");
        int n = sc.nextInt();
        int[] array =new int[n];
        System.out.println(" enter the "+n+"  element ");
        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        int[] freq = makeFrequencyarray(array);
        System.out.println(" Enter number of queries ");
        int q= sc.nextInt();
        while(q>0){
            System.out.println(" Enter the number to be searched");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
            q--;

        }
    }
    
}

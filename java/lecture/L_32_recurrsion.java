import java.util.Scanner;
public class L_32_recurrsion {
    static void printarray(int []arr, int idx){
        //base case 
        if(idx == arr.length) return;
        System.out.println(arr[idx] );
        printarray(arr, idx+1);

    }
    static int maxinarray(int[] arr, int idx ){
        if(idx== arr.length-1)
        return arr[idx];
         int smallans = maxinarray(arr, idx+1);

        return Math.max(arr[idx], smallans);
         
    }
    static int sumofarray(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int sum = arr[idx]+ sumofarray(arr, idx+1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n= sc.nextInt();
        int[] arr={2,43,4,5,3,2,5,44,556,6}; //printarray(arr, n);
        System.out.println(maxinarray(arr, 0));
        System.out.println(sumofarray(arr, 0));
         
    }
    
}

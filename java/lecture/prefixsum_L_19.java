import java.util.Scanner;
public class prefixsum_L_19 {
    static int[] suffixsum(int[] arr){
        int n = arr.length;
        int[] suffix = new int [n];
        suffix[n-1]= arr[n-1];
        for(int i=n-1 ; i>0; i--){
            suffix[i-1]= suffix[i]+ arr[i-1];
        }
        return suffix;
    }
    static int findarraysum(int[] arr){
        int totalsum = 0;
        for(int i= 0; i<arr.length;i++){
            totalsum += arr[i];
        }
        return totalsum;
    }
    static boolean equalsumpartion(int[] arr){
        int totalsum = findarraysum(arr);
        int prefsum = 0;
        for(int i=0 ; i< arr.length; i++){
            prefsum += arr[i];
            int suffixsum = totalsum - prefsum;
            if (suffixsum == prefsum){
                return true ;
            }
        }
        return false;
    }


    static int[] prefix(int[] arr){
        int n = arr.length;
        for(int i=1 ; i<n; i++){
            arr[i]= arr[i-1]+ arr[i];
        }
        return arr;
    }
    static int[] prefixsum(int[] arr){
        int n = arr.length;
        int[] pref = new int [n];
        pref[0]= arr[0];
        for(int i=1 ; i<n; i++){
            pref[i]= pref[i-1]+ arr[i];
        }
        return pref;
    }
    static void printarray(int[] ans){
        for(int i=0 ;i<ans.length; i++){
            System.out.print( " "+ ans [i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        // int [] array =  new int[n+1];
        // System.out.println("Enter "+ n + " elements");
        // for(int i=1 ; i<=n; i++){
        //     array[i]= sc.nextInt();
        // }
        // System.out.println("input array ");
        // printarray(array);
        // int [] pref = prefix(array);
        // printarray(pref);
        //given an array of integers of size n. answer q queries where you need to print the sum of value es in a given range of indices fom l to r (both included )    [note the value of l and r in queries follow 1 - based indiexing]
        
        // System.out.println("enter number of queries");
        // int q = sc.nextInt();

        // while(q-- > 0){
        //     System.out.println("enter range");
        //     int l= sc.nextInt();
        //     int r= sc.nextInt();
        //     int ans = pref[r] - pref[l-1];
        //     System.out.println("sum "+ ans);
        // }
        //check if we can partition the array into two sub array with equal sum . More formally, check that the prefix sum of a part of the aray is equall to the suffix sum of rest of the array .
        int [] array =  new int[n];
        System.out.println("Enter "+ n + " elements");
        for(int i=0 ; i<n; i++){
            array[i]= sc.nextInt();
        }
        System.out.println("input array ");
        printarray(array);
        //System.out.println(array.length);
        
        boolean res = equalsumpartion(array);
        System.out.println(res); 
        // homework question 
        System.out.println("input array ");
        printarray(array);
        int[] result = suffixsum(array);
        printarray(result);






        
    }
    
}

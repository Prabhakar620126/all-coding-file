//package java.lecture;
import java.util.Arrays;
import java.util.Scanner;

public class arrays_2d {
     static int[] smallestlargestelement(int[] arr){
        Arrays.sort(arr, 0, 4);
        printArray(arr);
        int[] ans = {arr[0], arr[arr.length -1]};
        return ans;
     }

    static boolean sort(int []arr){
        boolean check = true ;
        for(int i= 1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                check = false;
                break;
            }
        }
        return check;

    }
    static void coutofelement(int [] arr , int x){
        int cout = -1;
        for(int i= 0; i<arr.length; i++){
            if (arr[i]== x){
                cout++;
            }
            
        }
        System.out.println("the occurance of "+x+" is "+ cout );
    }
    static void printArray(int[] arr){
        for(int i= 0; i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    static void copyarray(int[] arr){
        for( int i = 0 ; i< arr.length ; i++){
            arr[i]= 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input from user 
        // System.out.println(" enter the size of  array : ");
        // int n= sc.nextInt();
        int [] arr = new int[5];
        arr[0] = 56;
        arr[1] = 44;
        arr[2] = 59;
        arr[3] = 47;
        arr[4] = 58;
        // System.out.println("Enter "+ n +" elements ");
        // for(int i =0; i<arr.length ; i++){
        //     System.out.println("enter the "+i+" in array ");
        //     arr[i]= sc.nextInt();
        // } 
        System.out.println(" orignal array");
        
        printArray(arr);
        //trying to copy arr to arr_2 
        System.out.println(" copied array_2 ");
        // // this make a deep copy of array 
        // //int[] arr_2 = arr.clone();
        int[] arr_2 = Arrays.copyOf(arr, 3);

        // printArray(arr_2);

        // // changing the value of arr_2
        // copyarray(arr_2);
        // System.out.println(" original array after changing arr_2");
        // printArray(arr);

        // System.out.println(" copied arr_2 after changing arr_2");
        // printArray(arr_2);

        coutofelement(arr, 5);
        int[] ans =smallestlargestelement(arr);
        System.out.println("smallest : " +ans[0]);
        System.out.println("largest :"+ ans[1]);



          

        


        
    }
    
}

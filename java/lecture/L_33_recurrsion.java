import java.util.ArrayList;

public class L_33_recurrsion {
    static boolean search(int arr[] , int target ,int idx){
        // base case 
        int n= arr.length;
        if(idx>=n) return false;
        if(arr[idx] == target) return true;
        return search(arr, target, idx+1);
         
         
    }
    static int findindex(int arr[] , int target ,int idx){
        // base case 
        int n= arr.length;
        if(idx>=n) return -1;
        if(arr[idx] == target) return idx;
        return findindex(arr, target, idx+1);
         
         
    }
    static void findallindex(int arr[] , int target ,int idx){
        // base case 
        int n= arr.length;
        if(idx>=n) return;
        if(arr[idx] == target)  System.out.println(idx);
        findallindex(arr, target, idx+1);
         
         
    }
    static ArrayList<Integer>  allindices(int [] a ,int target , int idx ){
        // base caase 
        int n= a.length;
         if(idx>= n ){
            return new ArrayList<Integer>();
         }
         ArrayList<Integer> ans = new ArrayList<>();
         if(a[idx]== target)
         ans.add(idx);

         ArrayList<Integer> smallans = allindices(a, target, idx+1);
         ans.addAll(smallans);
         return ans;

    }
  
    public static void main(String[] args) {
        int arr[]= {12,5,6,56,84,58,54,5,6,89,4,99};
        int n = 6;

        System.out.println(search(arr, n, 0));
        System.out.println(findindex(arr, n, 0));
        findallindex(arr, n, 0);
        ArrayList<Integer> ans = allindices(arr, n, 0);
        for(Integer i: ans){
            System.out.println(ans);
        }
    }
}

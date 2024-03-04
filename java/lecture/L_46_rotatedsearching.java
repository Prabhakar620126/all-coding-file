public class L_46_rotatedsearching {
    static int problem1(int[] arr){
        // A rotated sorted array is sorted array on which rotation operation has been performed some number of times given a rotated sorted array , find the index of the of the minimum element  in the array. follow 0- based indexing 
        // it is guaranted thet all the element in the array are unique.
        int n= arr.length;
        int st=0, end= n-1;
        int ans=-1;
        while (st<=end) {
            int mid= st+(end-st)/2;
            if(arr[mid]<=arr[n-1]){
                ans= mid;
                end= mid-1;
            }else{
                st= mid+1;
            }    
        }
        return ans;
    }
    static int problem2(int [] arr, int target){
        //given the sorted array of integer, which contains distinct elements , and an integer target return the index of target if it is in the array . otherwise return -1
        int n=arr.length;
        int st=0, end=n-1;
        while (st<=end) {
            int mid= st+(end-st)/2;
            if(arr[mid]== target){
                return mid;

            }
            else if(arr[mid]<arr[end]){// mid to end is sorted
                if(target>arr[mid]&&target<= arr[end]){
                    st= mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                // st to mid is sorted
                if(target>=arr[st] && target< arr[mid]){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }
        }
        return -1;

    }
    static int problem2_(int [] arr, int target){
        //search element in roatated array with dublicated element . return true if the element is found else return false  
        int n=arr.length;
        int st=0, end=n-1;
        while (st<=end) {
            int mid= st+(end-st)/2;
            if(arr[mid]== target){
                return mid;

            }else if(arr[st]==arr[mid]&&arr[st]==arr[end]){
                st--;
                end++;
            }
            else if(arr[mid]<=arr[end]){// mid to end is sorted
                if(target>arr[mid]&&target<= arr[end]){
                    st= mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                // st to mid is sorted
                if(target>=arr[st] && target< arr[mid]){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        int[] a= {3,4,5,1,2};
        System.out.println(problem1(a));
        int target = 2;
        System.out.println(problem2(a, target));
        int []b={1,1,1,1,2,2,3,4};
        System.out.println(problem2_(a, target));
    }
}

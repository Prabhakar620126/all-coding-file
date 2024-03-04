public class L_45_binary_search {
    static boolean binarySearch(int[] arr, int target){
        int n= arr.length;
        int st=0, end=n-1;
        while (st<=end) {
            int mid= st+(end-st)/2;
            if(target==arr[mid]){
                return true;
                
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                st= mid +1;
            }
        }
        return false;
        



    }
    static boolean recbinarysearch(int[] arr,int st, int end, int target ){
        if(st>end) return false;
        int mid = st+(end-st)/2;
        if(target==arr[mid]){
            return true;
        }else if(target <arr[mid]){
            return recbinarysearch(arr, st, mid-1, target);
        }else{
            return recbinarysearch(arr, mid+1, end, target);
        }
    }

    static int problem1(int []arr ,int x){
        // find the occurence of given element x , given that thengiven array is sorted . if no occurrence of x is found then return -1
        int n=arr.length;
        int fo=-1;
        int st=0, end= n-1;
        while(st<=end){
            int mid= st+(end-st)/2;
            if(arr[mid]==x){
                fo=mid;
                end=mid-1;

            }
            else if(x<arr[mid]){
                end= mid-1;
            }
            else{
                st=mid+1;

            }
        }
        return fo;

    }

    static int problem2(int a){
        // find the square root of the non negative value x. round it off to the floor integer value
        int st=0, end=a;
        int ans=-1;
        while (st<=end) {
            int mid= st+(end-st)/2;
            int val= mid*mid; //use long to avoid overflow
            if(val==a){
                return mid;
            }else if(val<a){
                ans= mid;
                st= mid+1;
            }else{
                end=mid-1;
            }

            
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target= 0;
        while (target!= 12) {
            System.out.printf( "%d exists in arr : %b  \n",target ,recbinarysearch(arr,0,arr.length-1, target));
            System.out.printf( "%d exists in arr : %b  \n",target ,binarySearch(arr, target));
            System.out.println();
            target++;
            int [] a ={2,5,5,5,6,6,8,9,9,9,9};
            int x= 5;
            System.out.println(problem1(a, x));
            int b= 30;
            System.out.println(problem2(b));


        }
        
    }
}

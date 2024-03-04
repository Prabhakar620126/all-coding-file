import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class L_43_count_radix_bucket_sort {
    static void display(int [] a ){
        for(int val:a){System.out.print(val + " ");}
        System.out.println();
    }
    static int findmax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max)
            max=arr[i];
        }
        return max;
    }
    static void basiccountsort(int[] arr){
        int max= findmax(arr);
        int[] a= new int[max+1];
        for(int i=0; i<arr.length; i++){  
            a[arr[i]]++;
            
        }
        int k=0;
        for(int i=0; i<a.length;
        i++){
            for(int j=0; j<a[i]; j++){
                arr[k++]=i;

            }
        }
    }

    static void countSort(int[] arr){
        int n= arr.length;
        int[] output = new int[n];
        int max= findmax(arr);
        int[] a= new int[max+1];
        for(int i=0; i<arr.length; i++){  
            a[arr[i]]++;   
        }
        System.out.println("frequency array");
        display(a);
        // majke prefix sum array of count array
        for(int i=1; i<a.length; i++){
            a[i]+= a[i-1];
        }
        //find the index of each element in the original array and put it to output array
        for(int i=n-1; i>=0;i--){
            int idx=a[arr[i]]-1;
            output[idx]= arr[i];
            a[arr[i]]--;
        }
        //copy all element of output to arr
        for(int i=0;i<n; i++){
            arr[i]= output[i];
        }
    }
    static void countSortr(int[] arr, int place){
        int n= arr.length;
        int[] output = new int[n];
        int [] count= new int[10];
        for(int i=0; i<arr.length; i++){  
            count[(arr[i]/place) %10]++;   
        }
        // majke prefix sum array of count array
        for(int i=1; i<count.length; i++){
            count[i]+= count[i-1];
        }
        //find the index of each element in the original array and put it to output array
        for(int i=n-1; i>=0;i--){
            int idx=count[(arr[i]/place)%10]-1;
            output[idx]= arr[i];
            count[(arr[i]/place)%10]--;
        }
        //copy all element of output to arr
        for(int i=0;i<n; i++){
            arr[i]= output[i];
        }
    }
    static void radixSort(int[] arr ){
        int max =findmax(arr);//get maxium element apply counting   sort element  based on place value 
        for(int place =1; max/  place>0; place*=10){
        countSortr(arr , place);
        } 
    }
    // bucket sort
    static void bucketsort(float[] arr1){
        int n=arr1.length;
        //buckets
        ArrayList<Float>[] buckets= new ArrayList[n];
        for(int i=0; i<n; i++){
            buckets[i]= new ArrayList<>();
        }
        for(int i=0; i<n;i++ ){
            int bucketIndex= (int)arr1[i]*n;
            buckets[bucketIndex].add(arr1[i]);

        }
        for(int i=0; i<buckets.length; i++){
            Collections.sort(buckets[i]);
        }
        // merge all buckets to get final sorted aeeay
        int index= 0;
        for(int i=0; i<buckets.length; i++){
            ArrayList<Float> currbucket= buckets[i];
            for(int j=0; j<currbucket.size();j++){
                arr1[index++] =currbucket.get(j); 
            }
        }
    }

    public static void main(String[] args) {
        int [] arr={5,5,3,4,6,5,8,2,9,7,8,4,6,1,2,3,5,4,6,8};
        System.out.println("array before sorting");
        display(arr);
        System.out.println("array after sorting :");
        //basiccountsort(arr);
        countSort(arr);
        display(arr);

        int []a={43,452,626,894,0,3};
        radixSort(a);
        display(a);
        float[] arr1={0.5f,0.4f,0.3f, 0.2f, 0.1f};
        bucketsort(arr1);
        for(float val: arr1){
            System.out.print(val +"  ");
        }
        
    }
}

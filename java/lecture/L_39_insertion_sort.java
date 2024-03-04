public class L_39_insertion_sort {
    static void printarrray(int[] arr){
        int n= arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }

    }

    static void insertation_sort(int []arr){
         int n= arr.length;
         for(int i=1; i<n; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]= temp;
                j--;

            }
         }
    }
     
    public static void main(String[] args) {
        int [] arr={ 12,56,35,2,45,8,65,34,12,55,75,62};
        insertation_sort(arr);
        printarrray(arr);
    }
    
}

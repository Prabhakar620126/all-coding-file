public class L_38_slectionsort {
    static void printarrray(int[] arr){
        int n= arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }

    }
    static void slectionsort(int[] arr){
        int n= arr.length;
        for(int i=0; i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n; j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;

                }

                 
            }
            if(min_index !=i){
            int temp =arr[i];
            arr[i]=arr[min_index];
            arr[min_index]= temp;
            }
        }
         

    }
    public static void main(String[] args) {
        int [] arr={ 12,56,35,2,45,8,65,34,12,55,75,62};

        slectionsort(arr);
        printarrray(arr);
    }
}

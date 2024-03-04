public class L_37_bubblesort {

    static void printarrray(int[] arr){
        int n= arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }

    }
    static void bubble_sort(int [] arr ){int n = arr.length;
        for(int i=0; i<n-1; i++){
            boolean flag= false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    flag= true;
                }
                

            }
            if(flag==false){
                return;
            }

        }
        //printarrray(arr); 

    }
    public static void main(String[] args) {
        int [] arr={ 12,56,35,2,45,8,65,34,98,55,75,62};
        bubble_sort(arr);
        printarrray(arr);
          
    }
}

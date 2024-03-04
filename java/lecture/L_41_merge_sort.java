public class L_41_merge_sort {
    static void displayarr(int[] arr){
        int n= arr.length;
        for(int i=0; i<n;i++)
        System.out.print(arr[i] +" ");
        System.out.println();
    }
    static void merge(int[] arr , int l, int mid, int r ){
        int n1= mid-l+1;
        int n2= r-mid;
        int [] left= new int [n1]; 
        int [] right = new int [n2];
        int i,j,k;
        for(i=0; i<n1; i++){
            left[i]= arr[l+i];
        }
        //displayarr(left);
        for(j=0; j<n2;j++){ 
            right[j]=arr[mid+1+j];
        }
        //displayarr(right);
        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]= left[i];
                k++;
                i++;

            }
            else{
                arr[k]= right[j];
                k++;
                j++;

            }
        }
            while(i<n1) {
                arr[k]=left[i];
                k++;
                i++;
            }
            while (j<n2) {
                arr[k]=right[j];
                k++;
                j++;
                
            }
        

    }

    static void merge_sort(int[] arr, int l, int r){
        //displayarr(arr);
        if(l>=r) return;
        int mid= (l+r)/2;
        merge_sort(arr, l, mid); 
        //displayarr(arr);
        merge_sort(arr, mid+1, r);
        //displayarr(arr); 
        merge(arr, l, mid, r);


    }
    public static void main(String[] args) {
        
        int []arr ={4,1,3,5,2,8,54,69,23 };
        int n=arr.length;
        System.out.println(n);
        System.out.println(" array before sorting :");
        displayarr(arr);
        System.out.println();
        merge_sort(arr, 0, n-1);
        System.out.println("array after sorting :");
        displayarr(arr);


        
    }
    
}

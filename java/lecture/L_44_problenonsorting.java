public class L_44_problenonsorting {
    static void display(int[] arr){
        int n= arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +"  ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int x ,int y){
        int temp;
        temp= arr[x];
        arr[x]= arr[y];
        arr[y]=temp;
    }
    static void sortAarr( int []arr ){
        // problrn 1-->

        int n=arr.length;
        int x=-1;
        int y=-1;
        if(n<=1) return;    
        for(int i=1; i<n; i++ ){
            if(arr[i-1]> arr[i]){
                if(x==-1){
                x=i-1;
                y=i;
                }
            
            else{
                y=i;
            }
        }
        }
        int temp= arr[x];
        arr[x]=arr[y];
        arr[y]= temp;

    }
    static void problem2(int[] arr){
        /*
         * given an array of positive  and negative integers , segregate them in linear time and constant space . the output should print all negative number followed by all positive numbers
         * 
         * Input [19,-20,7,-4,-13,11,-5,3]
         * 
         * output[-20,-4,-13,-5,7,11,19,3]
         */
        int n= arr.length;
        int l=0 ,r=n-1;
        while(l<r){
            while(arr[l]<0) l++;
            while(arr[r]>=0) r--;
            if(l<r){
                int temp;
                temp= arr[l];
                arr[l]=arr[r];
                arr[r]= temp;
                l++;
                r--;
            }
            
        }
        /*
         
         */
        
                
            
    }

    static void problem3(int[] arr){
        int n=arr.length;
        int[] count= new int[n];
        for(int i=0;i<n; i++){
            if(arr[i]==0) {
                count[arr[i]]++;
            }
            if(arr[i]==1) {
                count[arr[i]]++;
            }
            if(arr[i]==2) {
                count[arr[i]]++;
            }
        }
        display(count);
        int k=0;
        int j=count[0];
        while(j>0){
            arr[k++]=0;
            j--;
        }
        j=count[1];
        while(j>0){
            arr[k++]=1;
            j--;
        }
        j=count[2];
        while(j>0){
            arr[k++]=2;
            j--;
        }
        display(arr);
    }
    static void secondmethodproblen3(int [] arr){
        int n= arr.length;
        int mid=0, low=0, high=n-1;
        while (mid<=high) {
            if(arr[mid]==0){
                swap(arr, mid, low);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr, mid, high);
                high--;
            }
            
        }
    }


    
    public static void main(String[] args) {
        System.out.println("hi");
        int[] arr={10,5,6,7,8,9,3};
        display(arr);
        sortAarr(arr);
        display(arr);
         int [] a={-13,20,7,0,-4,-3,11,-5,-23};
         display(a);
         problem2(a);
         display(a);
         int[] b={0,2,1,2,0,0};
         //problem3(b);
         secondmethodproblen3(b);
         display(b);

        
        
        
    }
    
}

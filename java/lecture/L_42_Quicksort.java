public class L_42_Quicksort {
    static void displayarr(int[] arr){
        int n=arr.length;

        for(int i=0; i<n;i++){
            System.out.print(arr[i]+ "  ");
        }
        System.out.println();

    }
    static void swap(int[] arr , int x,int y ){
        int temp;
        temp= arr[x];
        arr[x]=arr[y];
        arr[y]=temp;

    }
    static int partition(int []arr, int st, int end){
        int pivoit = arr[st];
        int cnt= 0;
        for(int i=st+1; i<=  end; i++){
            if(arr[i]<=pivoit) cnt++;
        }
        int pivotindex= st+cnt;
        swap(arr, st, pivotindex);
        int i=st;
        int j= end;
        while(i<pivotindex && j>pivotindex){
            while(arr[i]<=pivoit) i++;
            while (arr[j]> pivoit) j--;
            if(i<pivotindex && j> pivotindex){
                swap(arr, i, j);
                i++;
            }
        }
        return pivotindex;

    }
    
    static void quicksort(int []arr , int st, int end){
        if( st>=end) return;
        int pi = partition(arr, st,end);
        quicksort(arr, st, pi-1);
        quicksort(arr, pi+1, end);
    }
    public static void main(String[] args) {
        int[] arr ={6,3,1,5,4};

        System.out.println("array before sorting :");
        int n= arr.length;
        displayarr(arr);
        quicksort(arr, 0, n-1);

        System.out.println("array after sorting :");
        displayarr(arr);

    }
}

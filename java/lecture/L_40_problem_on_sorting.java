public class L_40_problem_on_sorting {
    static void printarrray(int[] arr){
        int n= arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

    }
    static void ques1(int[]arr){
        //given an interger array ,move all 0's to the end of it while maintaining the relative ordr of non zero elemenys.
        //050342
        //534200
        int n= arr.length;
        for(int i=0; i<n-1; i++)
        {   boolean flag= false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag = true;
                }
            }
            if(flag==false){
                return;
            }
        }


    }

    static void que2(String[] s){
        //give an array of name of the fruit s; you are supposed to sort it in lexicographical ordr using the selection sort .
        int n= s.length;
        for(int i=0; i<n-1; i++){
            int min_index=i;
            for(int j=i+1;j<n; j++){
                if(s[j].compareTo(s[min_index])<0){
                    min_index= j;
                }
            }
            String temp= s[i];
            s[i]=s[min_index];
            s[min_index]=temp;
        }


    }
    public static void main(String[] args) {
        int [] arr={ 12,0,35,2,0,8,0,34,0,55,75,62};
        printarrray(arr);
        ques1(arr);
        printarrray(arr);

        String[] fruit={"kiwi", "apple","mango", "papaya", "grapes"};
        que2(fruit);
        for(String val: fruit){
            System.out.print(val+" ");
        }
        
    }
    
}

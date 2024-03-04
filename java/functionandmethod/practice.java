public class practice {
    public static void display(int[] arr){
        System.out.print("{");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("}");
    }
    public static int indexofarray(int number){
        int idx=0;
        while(number>0){
            number/=10;
            idx++;
            
        }
        return idx;
    }
    public static int[] numberinarray(int num){
        int[] x= new int [indexofarray(num)];
        int i=3;
        while(num>0){
            int z=num%10;
            num /=10;
            x[i] =z;
            i--;
        }
        return x;
    }
    public static void number(int c, int d) {
        int n=0;
        for(int i=c;i<=d;i++ ){
            boolean flag=false;
            if(i%2==0){
                continue;
            }else{
                int[] arr=numberinarray(i);
                for(int j=0; j<arr.length-1; j++){
                    for(int k=j+1; k<arr.length;k++){
                        if(arr[j]==arr[k]) {
                            break;
                        }
                        
                    }

                }



            }
        }
        
        

    }

    public static void bre(){
        int n=3;
        int a=0;
        int[] arr={1,0,0,0};
        for(int i=0; i<n; i++){
            for(int j=i+1;j<n+1;j++){
                if(arr[i]==arr[j]){
                    System.out.println("if");
                    System.out.println(i);
                    continue;
                }

            }
            System.out.println(i);
            System.out.println("outer loop");

        }
    }
    public static void main(String[] args) {
        number(1000,8000 );
        int [] a= {5,6,8,9,4,8,4,5};
        display(a);
        System.out.println(indexofarray(1000));
        bre();

        
    }
    
}

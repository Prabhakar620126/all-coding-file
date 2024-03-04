import java.util.Scanner;
public class timespace_L_25 {
    void f1(int [] arr){
        int n= arr.length ;
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        // time complexity (worst case T C) is O(n)
    }
    void f2(int [] arr1, int arr2[]){
        int n= arr1.length ;
        int m = arr2.length;
        for(int i=0; i<n; i++){
            System.out.println(arr1[i]);
        }
        for(int i=0; i<m; i++){
            System.out.println(arr2[i]);
        }
        // time complexity (worst case T C) is O(n+m )
    }
    void f3(int n){
        for(int i=0 ; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.println("hellow");
            }
        }
        // time complexity is O(n*n)
    }
    void f4(int n){
        for(int i=0 ; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.println("hellow");
            }
        }
        // 1+ 2+ 3 +4+...+(n-1)
        //total = ((n-1)n)/2
        // n*n/2 - n/2 (neglating the lower term and n as compare to n square )
        // time complexity is O(n*n)
    }
    void f5(int n){
        for(int i=0 ; i<n; i++){
            for(int j=0; j<sqrt(n); j++){
                System.out.println("hellow");
            }
        }
        // time complexity is O(n*sqrt(n))
    }
    void f6(int n){
        int co =0;
        for(int i=0;i<n; i*=2){
            co++;
        }
        //time complexity 
        //i<n
        // K th  iteration = 2^ k-1
        // k+1 th iteration = 2^ k
        //2^k< n  because(i<n)
        //taking log both side 
        //k log(2^2)< log(2^n)
        //k <log(n )( on base two)
        int val=0;
        for(int i=1; i<=n; i++){
            val++;
        }
        // time complexity 
        // k^p <= n because(i<n)
        //taking log both side 
        //p log(k^k)< log(k^n)
        //p <log(n )( on base k)
        //T M = O(log(n)) 
    }
    void spacecomplexity(){
        //reverse of array .

        int n ,i=0 ;
        int j= n-1;
        while(i<j){
            //swap(arr[i] , arr[n-1]);
            i++;
            j--;
        }
        // space complexity 
        // O(1) [ no new array is formed]
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        
        
    }
    
}
/*
running time depend on many factor : 
- logic / algorithm of code (for sum calculation (n*(n-1))/2 is better algorithms than loop )

-language (c, c++ , java , python..)
-machine cofiguration( machine prosssor)

defination --> no. of operation preform in programm  as function of input

types of time complexity analysis and there notations:
*worst case time complexity ->Big o O(n)
* best case time complexity --> Big omega(1)
* average case time complexity --> Big theta(n)
  
** time limit --> 1 sec. means maximum number of operation should 10^8


space complexity--->
* extra memory/ space used by an algorithm  directly proportion to input size 
-->space complexity of input and output  can not concidered if that is mention in question in question .
-->types of space complexity analysis and there notations:
*worst case space complexity ->Big o O(n)
* best case space complexity --> Big omega(1)
* average case space complexity --> Big theta(n)
--> space com. of 2 d matrix is 
O( m*n)



*/
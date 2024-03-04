public class timecomplexity_L_26 {
    void q1(){
        int n, val=0 ;
        for(int i=1; i<=n; i*=2){
            for(int j=1; j<=i; j++){
                val++;
            }
        }
    // time complexity 
    //for first loop  time complexity is k= log2^n , for second loop time complexity  there is gp for calculating t m  
    // GP 1,2,4,8, ... 2^k 
    // time complexity is O(n)    
    }

    
    public static void main(String[] args) {
        System.out.println("hi");

    }
    
}

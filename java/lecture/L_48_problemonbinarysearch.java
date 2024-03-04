public class L_48_problemonbinarysearch {
/*
    you have 'n '(n<=10^5) boxes of chocolate . each box cotain a[i](a[i]<=10000) cholate . you need to destribute these boxes among 'm' student such that the maximum number of chocolate to a student is mimimum.
    * one boxes will be allocated to exactly one student .
    * all the boxes should be allocated 
    *each student has to be allocated at least one box.
    *allotment should be in contiguous order , for instance ,a student cannot be allocated box 1 and box 3 , skipping box 2.
    calculate and return that minimum posible numbe.
    assume that it is always possible to distribute the chocolate 
 */
    static boolean isDivisionPossible(int [] a, int m, int mxChocoallowed){
        int numOfStudent=1;
        int cho=0;
        for(int i=0; i<a.length; i++){
            if(a[i]>mxChocoallowed ) return false;
            if(cho+a[i] <=mxChocoallowed){
                cho+=a[i];
            }else{
                numOfStudent++;
                cho= a[i];
            }
        }
        if(numOfStudent> m){
            return false;
        }else{
            return true;
        }
    }
 
    static int distributeChocolate(int[] a, int m){
        if(a.length< m )return -1;
        int ans=0, st=1, end= (int)1e9;
        while (st<=end) {
            int mid= st+(end-st)/2;
            if(isDivisionPossible(a, m, mid)){
                ans=mid;
                end= mid-1;
                  
            }else{
                st=mid+1;
            }
            
        }
        return ans;


    }
    /*
     * Q2. A new racing track for kids built in new york with 'n ' starting spot . The spots are located along a straight lina at position  x1, x2,.... xn(xi<= 10^9) for each i xi+1 > xi.
     * At a time only 'm 'childrean are allowed to enter the race track is for kids , they may run into each other while running . To prevent this we want to choose the starting sports such thar the minimum distance between any of them is as large as posible .What is the largest minimum distance ?
     */
    static boolean ispossible(int[] a, int k, int dist){
        int kidsplaced=1;
        int lastkid= a[0];
        
    for(int i=1; i<a.length; i++){
        if(a[i]-lastkid>= dist){
            kidsplaced++;
            lastkid= a[i];
            
        }
    }
    return kidsplaced>=k;

    }
    static int RaceTrack(int [] a, int k){
        if(k>a.length) return-1;
        int st=0 , end=(int)1e9;
        int ans =-1;
        while (st<=end) {
            int mid= st+(end-st)/2;
            if(ispossible(a, k, mid)){
                ans= mid;
                st= mid+1;
            }else{
                end= mid-1;
            }
            
        }
        return ans;
    }
    

    public static void main(String[] args) {// binary search on answer value
        int [] a={5,3,1,4,2};
        int m=3;
        System.out.println(distributeChocolate(a, m));
        int [] b= {1,2,4,8,9};
        int k= 2;
        System.out.println(RaceTrack(b, k));

        
        
    }
    
}

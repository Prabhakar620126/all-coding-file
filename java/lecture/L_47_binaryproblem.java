public class L_47_binaryproblem {

    /*  Q1. Search the 'target' value in a 2d integer matrix of dimension n*m and return true if found , else return false .
    this matrix has following properties:
    1. Integer in each row are sortedd from left to right . 
    2. the frist integer of each rowis greater than the last integer of the previous row.  
    */
    static boolean problem1(int [][] a, int target){
        // number of row =n , number of coloum=m
        int n= a.length, m= a[0].length;
        int st=0, end=n*m-1;
        while(st<= end){
            int mid= st+(end-st)/2;
            int midEle= a[mid/m][mid%m];
            if(midEle== target){
                return true;
            }
            if(target<midEle){
                end=mid-1;

            }else{
                st= mid+1;
            }
        }
        return false;

    }
    /*
        Q.2. write an efficient alorithm that search forna value tARGETNIN AN n*m  array integer metrix . this matrix has the following properties:
         -integer in each array are sorted in ascending from left to right
         -integer in each coloum are sorted in ascending from top to bottom. 

     */

    static boolean problem2(int[][] a, int target){
        int n= a.length, m= a[0].length;
        int i=0, j=m-1;
        while (i<n && j>=0) {
            if(a[i][j]== target) return true;
            if(target<a[i][j]){
                j--;

            }
            else{
                i++;
            }
            
        }
        return false;
    }
    

     static int problem3(int[]a){
        // mountain array question pick value return 
        int st=0, end= a.length;
        int ans= -1;
        while (st<=end) {
            int mid= st+(end-st)/2;
            if(a[mid]<a[mid+1]){
                ans=mid+1;
                st= mid+1;

            }else{
                end=mid-1;
            }

            
        }
        return ans;



     }

     // Q4. find pick element a[i-1]<a[i]<a[i+1]
     static int problem4(int [] a){
        int n=a.length;
        int st=0, end= n-1;
        while (st<=end) {
            int mid= st+(end-st)/2;
            if(mid==0||a[mid]>a[mid-1] &&mid==n-1 ||a[mid]>a[mid+1]){
                return mid;

            }
            if(a[mid]<a[mid]-1){
                st=mid+1;

            }else{
                end=mid-1;
            }


            
        }
        return -1;

     }
    public static void main(String[] args) {

        //Q.1
        int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int t= 30;
        System.out.println(problem1(arr, t));
        //Q2.
        int[][] a={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target= 20;
        System.out.println(problem2(a, target));
        //Q3.
        int[] b= {0,1,3,5,3,2,0};
        System.out.println(problem3(b));
        //Q4.
        int[] c={1,2,1,3,5,6,4};
        System.out.println(problem4(c));


    }
    
}
 
import java.util.Scanner;

public class array_2D_L_23 {
    static void  printarray(int[][] arr){
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

    }
    static int findsum(int[][] matrix , int l1 , int r1, int l2, int r2){
        int sum =0;
        for(int i=l1; i<=l2; i++ ){
            for(int j=r1; j<=r2;j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    static void findprefixsummatrix(int[][] matrix ){
        int n= matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=1; j<m; j++){
                matrix[i][j]+= matrix[i][j-1];
            }
        }
    }
    static int findsum2(int[][] matix , int l1, int r1, int l2 , int r2){
        int sum = 0;
        findprefixsummatrix(matix);
        printarray(matix);
        for(int i=l1; i<=l2; i++){
            if(r1>=1){
                sum +=matix[i][r2]- matix[i][r1-1];
            }else{
                sum += matix[i][r2];
            }
        }


        return sum;
    }
    static void findprefixsumrow_coloum(int[][] matrix ){
        int n= matrix.length;
        int m = matrix[0].length;
        // prefix sum in row wise 
        for(int i=0; i<n; i++){
            for(int j=1; j<m; j++){
                matrix[i][j]+= matrix[i][j-1];
            }
        }
        System.out.println(" row wise array sum ");
        printarray(matrix);
        // prefix sum coloum wise
        for(int j=0 ; j<m; j++){
            for(int i =1;i<n; i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
        System.out.println(" coloum wise array sum");
        printarray(matrix);
        

    }
    static int findsum3(int [][] matrix , int l1, int r1, int l2, int r2){
        int ans=0 , sum =0  , left =0 , up =0 , leftup =0;
        findprefixsumrow_coloum(matrix);
        sum = matrix[l2][r2];
        if(r1>= 1){
            left= matrix[l2][r1-1];
        }
        if(l1>=1){
            up = matrix[l1-1][r2];
        }
        if(l1>=1 && r1>=1){
            leftup= matrix[l1-1][r1-1];
        }
        ans = sum -left  -up + leftup;
        return ans;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int r= sc.nextInt();
        System.out.println("enter number of coloum" );
        int c = sc.nextInt();
        System.out.println("enter  "+ r*c +" element ");
        int [][] arr = new int[r][c];
        for(int i=0; i<r ;i++){
            for(int j=0; j<c; j++){   
                arr[i][j] = sc.nextInt();   
            }
        }  
        System.out.println(" Enter the rectangle  boundsry");
        int l1 =sc.nextInt();
        int r1 =sc.nextInt();
        int l2 =sc.nextInt();
        int r2 =sc.nextInt();

        System.out.println("rectangle sum " + findsum(arr, l1, r1, l2, r2));
        // System.out.println(findsum2(arr, l1, r1, l2, r2));
        System.out.println(findsum3(arr, l1, r1, l2, r2));
    }
    
}

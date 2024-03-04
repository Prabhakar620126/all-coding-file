import java.util.Scanner;

public class array_2D_L_21 {
    static void  printarray(int[][] arr){
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

    }
    static int[][] findtranspose(int[][] arr , int r , int c){
        int [][] ans = new int [c][r];
        for(int i=0; i<c ;i++ ){
            for(int j=0; j<r; j++){
                ans[i][j] = arr[j][i];
            }
        }

        return ans;
    }
    static void transposeinplace(int[][] matrix, int r, int c){
        for(int i=0; i<c; i++){
            for(int j=i ; j<r; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }
        printarray(matrix);

    }
    static void reversearray(int[] arr){
        int i= 0, j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
    static void rotate(int[][] matrix , int n){
        transposeinplace(matrix, n, n);
        for(int i=0; i< n ;i++){
            reversearray(matrix[i]);
        }
        printarray(matrix);
    }
    static int[][]pascal(int n){
        int [][] ans = new int [n][];

        for(int i =0; i<n; i++){
            ans[i]= new int[i+1];
            ans[i][0] = ans [i][i]=1;
            for(int j = 1; j<i;j++ ){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int r1= sc.nextInt();
        // System.out.println("enter number of coloum" );
        // int c1 = sc.nextInt();
        // System.out.println("enter  "+r1*c1 +" element ");
        // int [][] arr = new int[r1][c1];
        // for(int i=0; i<r1 ;i++){
        //     for(int j=0; j<c1; j++){
                
        //         arr[i][j] = sc.nextInt();   
        //     }
        // }
        // System.out.println(" matrix is ");
        // printarray(arr);
        // System.out.println("transpose of matrix");
        // int[][] ans = findtranspose(arr, r1, c1);
        // printarray(ans);
        //transposeinplace(arr, r1, c1);
        //rotate(arr , r1);
        int[][] ans= pascal(r1);
        printarray(ans);



    }
    
}

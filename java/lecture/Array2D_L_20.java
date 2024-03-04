import java.util.Scanner;

public class Array2D_L_20 {
    static void  printarray(int[][] arr){
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

    }
    static void add(int[][] a, int r1, int c1, int [][] b , int r2, int c2){
        if(r1!=r2 || c1!= c2){
            System.out.println("wrong input - addition not possible");
            return;
        }
        int[][] sum= new int[r1][c1];
        for(int i=0; i<r1;i++){
            for(int j=0; j<c1;j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printarray(sum);
    }
    static void multiply(int[][] a, int r1, int c1, int [][] b, int r2 , int c2  ){
        if(c1!= r2){
            System.out.println("wrong input - " );
            return;
        }
        int[][] mul = new int[r1][c2];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<r2;k++){
                    mul[i][j] += (a[i][k]*b[k][j]);
                }
            }
        }
        System.out.println(" multiplication of matrix a and matrix b is");
        printarray(mul);
    }

    static void homework(int[][] arr , int r, int c){
        int [][] a= new int  [r][c];
        for(int i=0; i<r; i++){
            int k= 0;
            for(int j= c-1 ;j>=0  ;j--){
                a[i][k] = arr[i][j];
                k++;
            }
            
        }
        printarray(a);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int r1= sc.nextInt();
        System.out.println("enter number of coloum" );
        int c1 = sc.nextInt();
        System.out.println("enter  "+r1*c1 +" element ");
        int [][] arr = new int[r1][c1];
        for(int i=0; i<r1 ;i++){
            for(int j=0; j<c1; j++){
                
                arr[i][j] = sc.nextInt();
                
            }

        }
        
        System.out.println("enter number of rows");
        int r2= sc.nextInt();
        System.out.println("enter number of coloum" );
        int c2 = sc.nextInt();
        System.out.println("enter  "+r2*c2+" element ");
        int [][] brr = new int[r2][c2];
        for(int i=0; i<r2 ;i++){
            for(int j=0; j<c2; j++){
                
                brr[i][j] = sc.nextInt();
                
            }

        }
        System.out.println("matrix 1");
        printarray(arr);
        System.out.println("matrix 2");
        printarray(brr);
        // System.out.println(" sum of matrix 1 and matrix 2 is");
        // add(arr, r1, c1, brr, r2, c2);
        multiply(arr, r1, c1, brr, r2, c2);

        // home work 
        //reverse each row
        /*
         1 2 3 10
         4 5 6 11
         7 8 9 12

         change to 
         10 3 2 1
         11 6 5 4
         12 9 8 7
         */

         homework(brr, r2, c2);
        



       

    }
}

import java.util.Scanner;

public class array_2D_L_22 {
    static void  printarray(int[][] arr){
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

    }
    static void printSpiralOrder(int[][] matrix , int r , int c){
        int toprow =0 , bottomrow = r-1, leftcol =0, rightcol =c-1;
        int totalElements = 0;
        while(totalElements< r*c){
            //toprow -> leftcol to right col
            for(int j=leftcol; j<=rightcol && totalElements< r*c ; j++){
                System.out.print(matrix[toprow][j] + " ");
                totalElements++;
            }
            toprow++;
            //rightrow --> toprow to bottom row
            for(int i=toprow;i<= bottomrow && totalElements< r*c ; i++){
                System.out.print(matrix[i][rightcol] +" ");
                totalElements++;
            }
            rightcol--;
            // bottomrow --> rightcol to leftcol
            for(int j =rightcol ; j>=leftcol && totalElements < r*c; j--){
                System.out.print(matrix[bottomrow][j] +" ");
                totalElements++;
            }
            bottomrow--;
            // leftcol --> bottomrow to toprow 
            for(int i= bottomrow; i>=toprow && totalElements < r*c ; i--){
                System.out.print(matrix[i][leftcol] +" ");
                totalElements++;
            }
            leftcol++;

        }

    }
    static int[][] makematrix(int n){
        int [][] matrix =new int[n][n];
        int toprow =0 , bottomrow = n-1, leftcol =0, rightcol =n-1;
        int curr = 1;
        while(curr<= n*n){

            //toprow -> leftcol to right col
            for(int j=leftcol; j<=rightcol && curr<= n*n ; j++){
                matrix[toprow][j] = curr++;
                
            }
            toprow++;
            //rightrow --> toprow to bottom row
            for(int i=toprow;i<= bottomrow && curr<= n*n ; i++){
                matrix[i][rightcol] = curr++;
                
            }
            rightcol--;
            // bottomrow --> rightcol to leftcol
            for(int j =rightcol ; j>=leftcol && curr <= n*n; j--){
                matrix[bottomrow][j] = curr++;
                
            }
            bottomrow--;
            // leftcol --> bottomrow to toprow 
            for(int i= bottomrow; i>=toprow && curr <= n*n ; i--){
                matrix[i][leftcol] = curr++;
                
            }
            leftcol++;

        }
        return matrix;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int r= sc.nextInt();
        // System.out.println("enter number of coloum" );
        // int c = sc.nextInt();
        // System.out.println("enter  "+ r*c +" element ");
        // int [][] arr = new int[r][c];
        // for(int i=0; i<r ;i++){
        //     for(int j=0; j<c; j++){
                
        //         arr[i][j] = sc.nextInt();   
        //     }
        // }
        // System.out.println(" spiral order ");
        // printSpiralOrder(arr, r, c);

        int [][] a =makematrix(r);
        printarray(a);
         
        
    }
    
}

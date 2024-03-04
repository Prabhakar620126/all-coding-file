//package java.lecture;

class Arraysexample{
    void searchelement(){
        int [] array= {5,63,58,7,25,69,89,7};
        int x = 7;
        int ans = -1;
        for(int i= 0 ; i<array.length; i++){
            if (array[i]== x){
                ans = i;
                System.out.println("found "+x + " at the index " +i);
            }
        }
    }
    void maxofarray(){
        int []arri = {5,4,8,7,3,78,98,};
        int max = 0 ;
        for(int i= 0 ; i<arri.length; i++){
            if(arri[i]>max){
                max= arri[i];
            }
        }
        System.out.println("max : "+max);

    }
    void sumofArray(){
        int[] arry ={1,4,6,10};
        int sum =0 ;
        for(int i=0; i<arry.length ; i++){
            sum=sum+arry[i];
        }
        System.out.println(sum);


    }
    
    void demoArrays(){
        int[] ages = new int[3];
        float[] weights = new float[3];
        //String[ ] names = new String[3];
        String [] names={"rahul","raj","prabhakar", "manish"};
        ages[0] = 34;
        ages[1]  = 12;
        ages[2] = 45;
        weights[0] = 56;
        weights[1] = 56;
        weights[2] = 56;

        // System.out.println(ages[0]);
        // System.out.println(ages[1]);
        // System.out.println(ages[2]);
        // System.out.println(names[0]);
        // System.out.println(names[1]); 
        // System.out.println(names[2]);
        System.out.println(names.length);
        System.out.println(weights.length);
        System.out.println(ages.length);
        // print by  use of loop 
        for(int i=0 ; i<3; i++){
            System.out.println(ages[i]);
        }
        for (int i= 0 ;i<3; i++){
            System.out.println(weights[i]);
        }

        // for each loop 
        // for(int age : ages){
        //     System.out.println(age);
        // }
        // int i= 0 ;
        // while(i<3){
        //     System.out.println(ages[i]);
        //     i++;
        //} 
        

    }
    void multidimensionarrays(){
        //int[][] arr_1 = new int[5][3];
        // other way is 
        int [][] arr = {{56,43,6},{32,45,12},{12,78,56},{66,55,44}};
        for(int i = 0 ; i<4; i++){
            for(int j= 0 ; j<3; j++){
                System.out.println(arr[i][j]);
            }
        }

        // 3D arrays 
        int [][][] arr_3 = new int [5][3][2]; // 5*3*2= 30 = 120 bytes 
        arr_3 [0][0][0] = 5;
        arr_3 [1][1][1] = 60;

        // System.out.println(arr[0][0]);
        // System.out.println(arr[0][1]);
        // System.out.println(arr[0][2]);
        // System.out.println(arr[0][3]);
        // System.out.println(arr[0][4]);
        // System.out.println(arr[0][5]);
        // System.out.println(arr[1][0]);
        // System.out.println(arr[1][1]);
        // System.out.println(arr[1][2]);
        // System.out.println(arr[2][0]);
        // System.out.println(arr[2][1]);
        // System.out.println(arr[2][2]);
        // System.out.println(arr[3][0]);
        // System.out.println(arr[3][1]);
        // System.out.println(arr[3][2]);
        // for(int i= 0; i<3; i++){
        //     System.out.println(arr[i]);
        // }
        //  for(int i= 0; i<3; i++){
        //     System.out.println(arr_3[i]);

        // }
        

        System.out.println(arr_3[0][0][0]);
        System.out.println(arr_3[1][1][1]);




    }
}

public class arrays_1 {
    public static void main(String[] args) {
        
        Arraysexample obj = new Arraysexample();
        //obj.demoArrays();   
        // obj.multidimensionarrays();  
        obj.sumofArray();
        obj.maxofarray();
        obj.searchelement();
    }
    
  }
  //notes of array
  // multi dimentional array  2D and 3D array . 
  //we create frist class then in class many function is created as per demand , to print output calling of function is necessary  in psvm 

   /*length of arrays 
   we can easily get the length of the arry by using inbuilt property
 for example if arr={ 4,56,7,9,6,8,899,,4,} then for length sout (arr.length ) .

             Traversing through the array
 we can use loops to tranverse through the array  there are many ways to iterate over the arry . the most common ways of lopping through array in java :
 *for loop 
    for(condition ){
        //code
    }
 *for each loop 
 for(int age =ages){
    sout(age)
 }
 *while loop


   */

  
   
    
  


public class assignmentvariable {
    public static void main(String[] args){
        // Q1- take 2 integer values in two variable x and y and print their product.
        int x = 2;
        int y = 4;
        int product = x*y;
        System.out.println("the product of two variale is");
        System.out.println( +product);

        // Q2- print the ASCII value of character 'U'
        char ch ='U' ;
        int ASCII = ch;
        System.out.println( "the ASCII value of character " +ch+ " is "+ASCII); 

        // Q3- write a java program to take the length and breadth of a rectangle and print its area 
        int length = 7;
        int breadth= 4;
        int area = length* breadth;
        System.out.println("the area of the rectangle is " + area);

        //Q4- write a java program to calculate the cube of a number .
        int number = 4;
        int cube = (number*number*number);
        System.out.println("the cube of a number"+ number+ " is " + cube); 

        // Q5- write a java peogram to swap two number with the help of a third variable .
        int p = 2;
        System.out.println("the frist number before swap is :" +p);
        int q=3;
        System.out.println("the second number before swap is :" +q);
        int r  ; // variable used to swap two number 
        r = p;
        p =q ;
        q = r;
        System.out.println(" the frist number after swap is  : "+p);
        System.out.println(" the second number after swap is  : "+q);
        



         

    }

    
}

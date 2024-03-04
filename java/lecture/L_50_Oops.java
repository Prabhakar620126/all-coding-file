import java.util.ArrayList;
import java.util.Arrays;

public class L_50_Oops {
    // static class student {
    //     private String name;
    //     private int rollnumber;
    //     protected double percent;
        
        
    // }
    public class Arraylist{
        int [] arr= new int[2];
        int idx=0;
        int size=0;
        public void add(int ele){
            if(size== arr.length){
                int[] brr= Arrays.copyOf(arr, arr.length*2);
                arr=brr;
            }
            arr[idx]= ele;
            idx++;
            size++;
            
        }
        public void set(int idx, int val){
                arr[idx]= val;
            }
    }
    public static fraction add(fraction f1, fraction f2){
        int numerator = f1.num* f2.den+ f1.den* f2.num;
        int dominator= f1.den*f2.den;
        fraction f3= new fraction(numerator, dominator);
        return f3;
    }
    public static fraction multiply(fraction f1, fraction f2){
        int numerator = f1.num* f2.num;
        int dominator= f1.den*f2.den;
        fraction f3= new fraction(numerator, dominator);
        return f3;
    }
    public static int gcd(int num, int den){
        int min = Math.min(num, den);
        for(int i=min; i>=1; i--){
            if(num%i==0 && den%i==0) return i;
        }
        return min;
    }
    static class fraction{
        int num;
        int den;
        public fraction(int num, int den){
            this.num=num;
            this.den=den;
            simplify();
        }
        public void simplify(){
            int hcf = gcd(num, den);
            num/=hcf;
            den/=hcf;

        }
    }
    public static void change(student s){
        // the oops class object is passed by reference not passed by value

        s.name= "priyanshu";
    }
    static void arraylist(){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(13);
        arr.add(14);
        arr.add(9);
        arr.set(3, 10);
        System.out.println(arr);
    }
    public static void main(String[] args) {
        student.noOfStudent=100;
        student y =new student("prabhakar ", 42, 95.3);
        System.out.println(student.noOfStudent);
        
        student x =new student();
        x.name= "prabhakar";
        x.get(42) ;
        System.out.println(student.noOfStudent);
        x.percent= 85.5;
        System.out.println(x.name);
        change(x);
        System.out.println(x.name);
        System.out.println(x.get(42) );
        System.out.println(x.percent);
        
        System.out.println(y.name);
        System.out.println(y.get(42) );
        System.out.println(y.percent);
        System.out.println(x.schoolname);
        System.out.println(student.noOfStudent);
        System.out.println(x.getage (15));

        System.out.println("---------------------------");
        fraction f1= new fraction(35, 21);
        fraction f2= new fraction(7, 3);
        System.out.println(f1.num+"/"+f1.den);
        System.out.println(f2.num+"/"+f2.den);
        fraction f3= add(f1, f2);
        System.out.println(f3.num+"/"+f3.den);
        fraction f4= multiply(f1, f2);
        System.out.println(f4.num+"/"+f4.den);
        System.out.println("---------------------------");
        arraylist();
        ArrayList arr= new ArrayList<>();
        arr.add(2);
        arr.add(1);
        System.out.println(arr.size());
        arr.add(5);
        System.out.println(arr.size());
        System.out.println(arr);
        arr.set(2,50);
        System.out.println(arr);

        


 



        
    }
}
/*
 * Static function --> used if we want to access a function in the class name  through just classname function.
 */

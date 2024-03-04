import java.util.Scanner;

public class L_34_recurrision {
    static  String removeA(String s  ,int idx){  
        int n= s.length();
        // base case 
        if (idx==n) return " ";
        String smallans= removeA( s, idx+1);
        char currchar= s.charAt(idx);
        if (currchar != 'a'){
            return currchar+smallans;
        }
        else{
            return smallans;
        }

    }
    static String reverse(String s, int idx ){
        int n= s.length();
        if(idx==n ) return "";
        String smallans =reverse(s, idx+1);
        return smallans+s.charAt(idx);

    }
    static boolean ispalindrome(String s, int l , int r){
        if(l>=r) return true;
        return(s.charAt(l)==s.charAt(r)&& ispalindrome(s, l+1, r-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        // System.out.println(s);
        // for(int i=0; i<s.length(); i++){
        //     System.out.print(s.charAt(i)+" ");
        // }
        //System.out.println(removeA(s, 0));
        System.out.println(reverse(s, 0));
        String rev= reverse(s, 0);
        if(rev.equals(s)){
            System.out.println("palindrome");

        } else{
            System.out.println("not palindrome");
        }
        int n= s.length();
        System.out.println(ispalindrome(s, 0, n-1 ));


    }
}
 
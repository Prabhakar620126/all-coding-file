import java.util.*;
public class L_49_String {
    static void Stringoperationaddition(){
        String str= "abc";
        str+= "xyz";
        str += 10;
        System.out.println(str);
        System.out.println(str+ 10+20);
        System.out.println(str+ (10+20));
        System.out.println( 10+20+str);
    }
    static void substring(){
        // substring is continous part of a string (0, 3 ) 0 zero is included and 3 is excluded
        String s="Suman";
        System.out.println(s.substring(0,4));
        System.out.println( s.substring(1));
        String p="abcd";
        for(int i=0; i<=3; i++){
            for(int j =i+1; j<=4; j++){
            System.out.print(p.substring(i,j)+ "  ");
            }
            //System.out.println();
        }    
    }
    static void equallto(){
        String s1="hello";
        String s2="hello";
        String s3=new String("hello");
        System.out.println();
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }
    static void Stringbuilder(){
        /*
         * Important constructor of String Builder class
         * -StringBuilder():
         * -StringBuilder(String str):
         * - StringBuilder(int capacity)
         */

        StringBuilder str= new StringBuilder("hello");
        str.append("world"); // for add string in same perivious string 
        System.out.println(str);
        // setCharAt(index:_, ch:"_") --> this change the character of mention in this function
        str.setCharAt(0, 'm');
        System.out.println(str);
        //insert(offset:_ , c:_)--> used for insert any charater at given place 
        str.insert(5, '-') ;
        System.out.println(str);
        str.deleteCharAt(5);
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.delete(5, 10);
        System.out.println(str);     

    }
    static void toggle(){
        StringBuilder str= new StringBuilder("PraBhaKar SHAhi");
        System.out.println(str);
        //toggle  
        // PraBhaKar SHAhi--> pRAbHAkAR shaHI
        for(int i=0; i<str.length(); i++){
            boolean flag= true;
            char ch=str.charAt(i);
            if(ch==' ') continue;
            int asci= (int)ch;
            if(asci>=97 && asci<120) flag= false;
            if(flag==true){
                asci+=32;
                char dh= (char)asci;
                str.setCharAt(i, dh);
            }else{
                asci-=32;
                char dh=(char)asci;
                str.setCharAt(i, dh); 
            }

        }
        System.out.println(str);
        
    }
    static void togglestring(){
        String str ="PraBhaKar SHAhi";
        System.out.println(str);
        //toggle  
        // PraBhaKar SHAhi--> pRAbHAkAR shaHI
        for(int i=0; i<str.length(); i++){
            boolean flag= true;
            char ch=str.charAt(i);
            if(ch==' ') continue;
            int asci= (int)ch;
            if(asci>=97 && asci<120) flag= false;
            if(flag==true){
                asci+=32;
                char dh= (char)asci;
                str= str.substring(0, i)+dh+ str.substring(i+1);
            }else{
                asci-=32;
                char dh=(char)asci;
                str= str.substring(0, i)+dh+ str.substring(i+1); 
            }

        }
        System.out.println(str);
        
    }
    static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    static void Palindrome(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                if(isPalindrome(str.substring(i,j))==true){
                    System.out.print(str.substring(i,j)+" ");
                    count++;

                }
            }
        }
        System.out.println("\n total number of palindrome is: "+ count);
    }
    static void reversewordInSentance(){
        String str="I am an online educator";
        str +=" ";
        String ans= "";
        StringBuilder sb= new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch!= ' '){
                sb.append(ch);
            }else{
                sb.reverse();
                ans+= sb;
                ans += " ";
                
                sb = new StringBuilder("");
            }
        }
        System.out.println(ans);


    }
    static void StringCompression(){
        String str="aaabbbbcddee";
        String ans= "" +str.charAt(0);
        int count =1;
        for(int i=1; i<str.length(); i++){
            char curr= str.charAt(i);
            char prev =str.charAt(i-1);
            if(curr==prev){
                count++;
            }else{
                if(count>1 )ans+=count;
                count =1;
                ans+= curr;
            }
        }
        if(count>1) ans +=count;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s = sc.nextLine();
        String s= "prabhakar";
        System.out.println(s);
        int len= s.length();
        System.out.println(len);
        System.out.println(s.charAt(6));
        System.out.println(s.indexOf('k'));
        String g= "priyanshu";
        System.out.println(g);
        System.out.println(s.compareTo(g));
        System.out.println(s.contains("bha"));
        System.out.println(g.endsWith("shu"));
        System.out.println(s.toLowerCase());
        System.out.println(g.toUpperCase());
        String s1= g.concat(g);
        System.out.println(s1);

        System.out.println(s.concat(g));
        Stringoperationaddition();
        substring();
        equallto();
        Stringbuilder();
        toggle();
        togglestring();
        String p = "abbd";
        Palindrome(p);
        reversewordInSentance();
        StringCompression();
        
    }
    
}

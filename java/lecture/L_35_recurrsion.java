import java.util.ArrayList;
import java.util.Scanner;
public class L_35_recurrsion {
    
        // static ArrayList<String> getssq(String s){
        //     ArrayList<String> ans= new ArrayList<>();
        //     // base case 
        //     if(s.length() ==0);
        //     {
        //         ans.add("");
        //         return ans;
        //     }
    
        //     char curr =s.charAt(0);
        //     ArrayList<String> smallans = getssq(s.substring(1));
        //     for(String ss: smallans){
        //         ans.add(ss);
        //         ans.add(curr    + ss);  
        //     }
        //     return ans;
    
        // }
        static void printSSQ(String s, String currans){
            if(s.length()==0) return ;
            char curr = s.charAt(0);
            String remString = s.substring(1);

            printSSQ(remString, currans +curr);
            printSSQ(remString, currans);

        }
        static void subsetsum(int[] a ,int n , int idx, int sum){
            if(idx>=n){
                System.out.println(sum);
                return;
            }
            subsetsum(a, n, idx+1, sum);
            subsetsum(a, n, idx+1, sum + a[idx]);
            
        }
        public static void main(String[] args) {
            //String s="abc";
            //ArrayList<String> ans = print("abc", "");
            //for(String ss: ans )   
            //System.out.println(ss);
            int[] a = {2 ,3 ,4};
            int n= a.length;
            subsetsum(a, n, 0, 0);
            
        }
    
        
    }
    
    


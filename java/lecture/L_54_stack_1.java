import java.util.*;
public class L_54_stack_1 {
    public static void copystack(){
        Scanner sc= new Scanner(System.in);
        Stack<Integer> st= new Stack<>();
        int n;
        System.out.println("Enter the number of element");
        n = sc.nextInt();
        System.out.println("Enter the element: ");
        for(int i=1;i<=n;i++){
            int x= sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        Stack<Integer> gt= new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        Stack<Integer> rt= new Stack<>();
        while(gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println(rt);


    }
    public static void insertioninstack(){
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(99);
        System.out.println(st);
        int idx = 0;
        int x=7;
        Stack<Integer> temp = new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }

        st.push(x);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
    public static void displaystack(){
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(99);
        System.out.println(st);
        Stack<Integer> rt= new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());

        }
        while(rt.size()>0){
            int x=(rt.pop());
            System.out.print(x + " ");
            st.push(x);
        }
        System.out.println();
        //display stack using array 
        int n= st.size();
        int[] arr= new int[n];
        for(int i=n-1; i>=0;i--){
            arr[i]= st.pop();
        }
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }

    }
    public static void displayrec(Stack<Integer> s){
        if(s.size()==0) return;
        int x= s.pop();
        System.out.print(x +" ") ;
        displayrec(s);
        s.push(x);

    }
    public static void reversestack(Stack<Integer> s){
        System.out.println(s);
        Stack<Integer> rt = new Stack<>();
        while(s.size()>0){
            rt.push(s.pop());
        }
        System.out.println(rt);
        Stack<Integer> qt = new Stack<>();
        while(rt.size()>0){
            qt.push(rt.pop());

        }
        System.out.println(qt);

    }
    public static void pushatbottom(Stack<Integer> s , int x){
        Stack<Integer> st = new Stack<>();
        while(s.size()>0){
            st.push(s.pop());

        }
        s.push(x);
        while(st.size()>0){
            s.push(st.pop());
        }
        

  
    }
    public static void reversestackrec(Stack<Integer> s){
        if(s.size()==0) return;
        int top = s.pop();
        reversestackrec(s);
        //System.out.print(top +" ");
        pushatbottom(s, top);
    }

    public static void underflowstatck(Stack<Integer> s){
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.pop();
        System.out.println(s);
        // underflow condition  when s.size ==0 

    }
    

    public static void main(String[] args) {
        

        Stack<Integer> st= new Stack<>();
        //System.out.println(st.isEmpty());
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(99);

        //displayrec(st);
        //displayrecsame(st);
        // peek
        //System.out.println(st.peek());

        System.out.println();

        
        System.out.println(st);
        underflowstatck(st);
        // System.out.println("size is :"+ st.size());
        // st.pop();
        // System.out.println("size is :"+ st.size());
        // System.out.println(st);
        // st.pop();
        
        // System.out.println(st);         
        // System.out.println("size is :"+ st.size());
        // System.out.println(st.isEmpty());
        //copystack();
        //insertioninstack();
        //displaystack();
        //reversestack(st);
        // reversestackrec(st);
        // System.out.println();
        // System.out.println(st);
        

        
    }
    
}
  
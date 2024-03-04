public class L_54_stack_2 {
    public static class stack{
        private int[] arr= new int[5];
        private int s= arr.length; 
        private int idx =0;
        void push(int x){
            if(idx==s){
                System.out.println(" stack is full  ! ");
                return;
            }

            arr[idx]=x;
            idx++;
        }
        int pop(){
            if(idx==0){
                System.out.println("stack is empty!");
                return-1;
            }
            int x= arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return x;
        }
        int peek(){
            if(idx==0){
                System.out.println("stack is empty !");
                return-1;
                
            }
            else{int x= arr[idx-1];
            return x;}
        }
        void display(){
            System.out.print("{");
            for(int i=0; i<idx; i++){
                System.out.print(arr[i]+" ");

            }
            System.out.print("}");
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isempty(){
            if(idx==0){
                return true;

            }else{
                return false;
            }
        }
        boolean isfull(){
            if(idx==s){
                System.out.println("stack is full !");
                return true;

            }else{
                return false;

            }
        }

    }
    public static void main(String[] args) {
        stack st= new stack();
        st.push(5);
        st.push(6);
        st.push(23);
        st.push(89);
        st.push(23);
        st.push(89);
        st.display();
        st.pop();
        st.pop();
        st.display();
        System.out.println(st.peek());
        st.pop();
        st.pop();
        st.display();
        System.out.println(st.peek());
        st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isempty());
        System.out.println(st.isfull());
        
        
    }
    
}

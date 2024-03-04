

public class L_54_stack_3 {
    public static class Node{
        private int val;
        private Node next;
        Node(int val){ 
            this.val=val;
        }
    }
    public static class Linkedliststack{
        Node head = null;
        int size= 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next= head;
            head= temp;
            size++;
        }
        int pop(){
            if(head.next==null){
                System.out.println("stack is empty!");
                return -1;
            }
            int x= head.val;

            head= head.next;
            size--;
            return x;
        }
        int peek(){
            if(head.next==null){
                System.out.println("stack is empty!");
                return -1;
            }
            int x= head.val;
            return x;

        }
        void displayrev(){
            Node temp =head;
            System.out.print("{");
            while(temp !=null){
                System.out.print(temp.val +" ");
                temp= temp.next;
            }
            System.out.println("}");
            System.out.println();
        }
        int size(){
            return size;
        }
        boolean isempty(){
            if(head.next==null){
                return true;

            }else {
                return false;
            }
        }
        void displayr(Node h){
            if(h==null) {
                
                return;
            }
            displayr(h.next);
            System.out.print(h.val +" ");
            
        }
        void display(){
            displayr(head);
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        Linkedliststack st= new Linkedliststack();
        st.push(5);
        st.push(6);
        st.push(23);
        st.push(89);
        st.push(23);
        st.push(89);
        st.displayrev();
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
        
        
    }
    
}

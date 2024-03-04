public class L_51_linkedList {
    static void display(Node head){
        Node temp= head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp =temp.next;
        }
    }
    static void displayr(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        displayr(head.next);
    }
    public static class Node{
        int data; // value
        Node next; // address of next node
        Node(int data){
            this.data= data;
        }
    }  
    public static class linkedlist{
        Node head = null ;
        Node tail= null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }
            else{
                tail.next= temp;
            }
            tail= temp;
        }
        void display(){
            Node temp= head;
            while (temp!=null) {
                System.out.print(temp.data +" ");
                temp= temp.next;
                
            }
            System.out.println();
        }
        int size(){
            Node temp= head;
            int count =0;
            while (temp!=null) {
                count++;
                temp= temp.next;
            }
            return count;
        }
        void insertAtStart(int val){
            Node temp= new Node(val);
            if(head== null){
                head= tail =temp;
                
            }else{
                temp.next= head;
                head= temp;
            }
        }
        void insertAt(int idx, int val){
            Node t= new Node(val);
            Node temp=head;
            if(idx==size()){
                insertAtEnd(val);
                return;
            }else if(idx==0){
                insertAtStart(val);
                return;
            }else if(idx<0 || idx>size()){
                System.out.println("wrong index");
                return;
            }
            for(int i=1; i<=idx-1; i++){
                temp= temp.next;
            }
            t.next= temp.next;
            temp.next= t;

        }
        int getAt(int idx){
            if(idx<0 || idx>size()){
                System.out.println("wrong index");
                return -1;
            }
            Node temp= head;
            for(int i=1; i<idx; i++){
                temp= temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            if(idx==0) {
                head= head.next;
                return;
            }
                Node temp = head;
                for(int i=1; i<=idx-1;i++){temp= temp.next;}
                temp.next = temp.next.next;
                tail= temp;
                
            
        }

    }
    static void basic(){
        Node a= new Node(5);
        Node b= new Node(3);
        Node c= new Node(9);
        Node d= new Node(8);
        Node e= new Node(16);
        // 5 3 9 8 16
        a.next=b;  //5-->3 9 8 16
        b.next=c; //5-->3-->9 8 16
        c.next=d; //5-->3-->9-->8  16
        d.next=e;   //5-->3-->9-->8-->16
        e.next= null;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
        System.out.println(d.data);
        System.out.println(e.data);
        System.out.println(a.next);
        System.out.println(b.next);
        System.out.println(c.next);
        System.out.println(d.next);
        System.out.println(e.next);
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);
        // print using for loop
        Node temp=a;
        for(int i=1; i<=5; i++){
            System.out.print(temp.data);
            temp= temp.next;
            System.out.print("  ");
        }
        System.out.println();
        // displaing the while loop
         temp=a;
        while(temp!=null){
            System.out.print(temp.data);
            temp= temp.next;
            System.out.print(" ");
        } 


    }
    public static void main(String[] args) {
        //basic();
        Node a= new Node(5);
        Node b= new Node(3);
        Node c= new Node(9);
        Node d= new Node(8);
        Node e= new Node(16);
        a.next=b;  
        b.next=c; 
        c.next=d; 
        d.next=e;
        display(a);
        System.out.println();
        displayr(a);
        System.out.println();
        System.out.println("---------------------");
        // object of linkedlist class 
        linkedlist ll= new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display(); 
        System.out.println(ll.size());
        ll.insertAtStart(8);
        ll.display();
        ll.insertAt(2, 10);
        ll.display();
        ll.insertAt(0, 100);
        ll.display();
        System.out.println(ll.getAt(0));
        System.out.println(ll.size());
        ll.deleteAt(0);
        ll.display();
        System.out.println(ll.size());

        
        
    }
    
}

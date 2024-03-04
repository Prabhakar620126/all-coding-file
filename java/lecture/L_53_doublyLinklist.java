public class L_53_doublyLinklist {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val= val;
        }

    }
    public static void display(Node head){
        Node temp= head ;
        while(temp!= null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayrev(Node tail){
        Node temp= tail ;
        while(temp!= null){
            System.out.print(temp.val +" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display2(Node randon){
        Node temp= randon ;
        while (temp.prev!= null) {
            temp=  temp.prev;
        }
        while(temp!= null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node insertatHead(Node head , int val){
        Node temp = new Node (val);
        temp.next= head;
        temp.prev = null;
        head.prev = temp;
        return temp;

    }

    public static Node insertatTail(Node head , int val){
        Node tail= head;
        while (tail.next != null) {
            tail= tail.next;
        }
        Node temp = new Node (val);
        tail.next = temp;
        temp.prev= tail;
 
        return head;

    }
    public static void insertAtIdx(Node head , int idx, int x){
        Node s= head;
        for(int i=1; i<idx; i++){
            s= s.next;
        }
        Node r= s.next;
        Node t= new Node(x);
        s.next = t;
        t.prev =s;
        t.next= r;
        r.prev = t;
    }
    public static boolean palindrome(Node head ){
        Node temp = head;
        while(temp.next != null){
            temp= temp.next;
        }
        Node tail= temp;
        Node temp1= head;

        while(temp1!=tail){
            if(temp1.val!= tail.val){return false;}
            temp1= temp1.next;
            tail= tail.prev;
        }
        return true;
    }
    public static boolean two_sum(int x){
        Node a = new Node(0);
        Node b = new Node(10);
        Node c = new Node(20);
        Node d = new Node(30);
        Node e = new Node(40);
        a.prev =null;
        a.next= b;
        b.prev= a;
        b.next =c;
        c.prev = b;
        c.next =d;
        d.prev = c;
        d.next =e;
        e.prev= d;
        e.next = null;
        Node head = a;
        Node tail= e;
        while(head.val<tail.val){
            if(head.val+ tail.val== x ){
                System.out.println("target is found" );
                return true;
            }else if(head.val+tail.val> x) tail= tail.prev;
            else{
                head= head.next;
            }


        }
        return false;
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(10);
        Node e = new Node(4);
        a.prev =null;
        a.next= b;
        b.prev= a;
        b.next =c;
        c.prev = b;
        c.next =d;
        d.prev = c;
        d.next =e;
        e.prev= d;
        e.next = null;
        display(a);
        System.out.println(palindrome(a));
        insertAtIdx(a, 3, 80);
        display(a);
        // displayrev(e);
        // display2(c);
        Node z= insertatHead(a, 50);
        display(z);
        Node y= insertatTail(a, 50);
        display(y);
        System.out.println(two_sum(20));
        


        
    }
}

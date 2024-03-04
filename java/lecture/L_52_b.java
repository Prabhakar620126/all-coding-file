import java.util.*;

public class L_52_b {
    static public class Node {
        int val;
        Node next;

        Node(int x) {
            val = x;
        }
    }

    static void display(Node a) {
        Node temp = a;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    static void splitOddEven() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(30);
        Node d = new Node(18);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(11);
        Node h = new Node(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        System.out.println("-----");
        display(a);
        Node temp = a;
        Node odd = new Node(101);
        Node even = new Node(100);
        Node o = odd;
        Node ev = even;
        System.out.println("hi");
        while (temp != null) {
            if (temp.val % 2 == 0) {
                ev.next = temp;
                ev = temp;
            } else {
                o.next = temp;
                o = temp;
            }
            temp = temp.next;

        }
        ev.next = null;
        o.next = null;
        System.out.println("Odd Nodes:");
        display(odd.next);
        System.out.println("Even Nodes:");
        display(even.next);

    }
    public static void displayrecurrsion(Node head){
        if(head== null) {
            System.out.println();
            return ;
        }
        System.out.print(head.val +" ");
        displayrecurrsion(head.next);
        
        


    }

    static void splitOddEveninline() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(30);
        Node d = new Node(18);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(11);
        Node h = new Node(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        System.out.println("-----");
        display(a);
        Node temp = a;
        Node odd = new Node(101);
        Node even = new Node(100);
        Node o = odd;
        Node ev = even;
        System.out.println("hi");
        while (temp != null) {
            if (temp.val % 2 == 0) {
                ev.next = temp;
                ev = temp;
            } else {
                o.next = temp;
                o = temp;
            }
            temp = temp.next;

        }
        ev.next = null;
        o.next = even.next;
        System.out.println("Odd Nodes:");
        display(odd.next);
        // System.out.println("Even Nodes:");
        // display(even.next);

    }

    static Node evenoddwithextraspace(Node a) {
        if (a == null || a.next == null) {
            return a;
        }
        Node temp = a;
        Node evenhead = new Node(0);
        Node oddhead = new Node(0);
        Node odd = oddhead;
        Node even = evenhead;
        while (temp != null) {
            if (temp.val % 2 == 0) {
                even.next = temp;
                //even= temp;
                even = even.next;

            } else {
                odd.next = temp;
                //odd= temp;
                odd = odd.next;
            }
            temp = temp.next;

        }
        even.next = null;
        odd.next = evenhead.next;

        return (oddhead.next);
    }
    static void removeduplicate(){
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(3);
        Node d = new Node(5);
        Node e = new Node(5);
        Node f = new Node(5);
        Node g = new Node(11);
        Node h = new Node(11);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        display(a);
        Node temp = a;
        while(temp != null && temp.next!= null){
            if(temp.val== temp.next.val){
                temp.next = temp.next.next;
            }
            if(temp.next ==null) break;
            if(temp.val != temp.next.val){
                temp = temp.next;
            }
            

        }
        display(a);
    }
    public static Node reverse(Node head){
        if(head.next == null) return head;
        Node newhead= reverse(head.next);
        head.next.next= head;
        head.next= null;
        return newhead;
        
    }
    public static void main(String[] args) {
        //splitOddEven();
        //splitOddEveninline();
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(30);
        Node d = new Node(18);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(11);
        Node h = new Node(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        System.out.println("Original List:");
        display(a);
        // Node p = evenoddwithextraspace(a);
        
        // System.out.println("Odd Nodes:");
        // display(p);
        // removeduplicate();
        displayrecurrsion(a);
        Node p = reverse(a);
        displayrecurrsion(p);
    }
}

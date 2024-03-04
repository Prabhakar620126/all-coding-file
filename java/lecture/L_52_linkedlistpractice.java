import java.util.*;
public class L_52_linkedlistpractice {
    static public class Node {
        int val;
        Node next;

        Node(int x) {
            val = x;
        }
    }

    static void deleteNode(Node node) {
        /*
         * There is a singly-linked list head and we want to delete a node node in it.
         * 
         * You are given the node to be deleted node. You will not be given access to
         * the first node of head.
         * 
         * All the values of the linked list are unique, and it is guaranteed that the
         * given node node is not the last node in the linked list.
         * 
         * Delete the given node. Note that by deleting the node, we do not mean
         * removing it from memory. We mean:
         * 
         * The value of the given node should not exist in the linked list.
         * The number of nodes in the linked list should decrease by one.
         * All the values before node should be in the same order.
         * All the values after node should be in the same order.Custom testing:
         * For the input, you should provide the entire linked list head and the node to
         * be given node. node should not be the last node of the list and should be an
         * actual node in the list.
         * We will build the linked list and pass the node to your function.
         * The output will be the entire list after calling your function.
         */
        node.val = node.next.val;
        node.next = node.next.next;
    }

    static void display(Node a) {
        Node temp = a;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    static Node nthnode(Node head, int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;
        // m th node from start
        temp = head;
        for (int i = 1; i <= m - 1; i++) {
            temp = temp.next;
        }
        return temp;

    }

    public static Node nthNode2(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;

        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static Node removingnthNode(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;

        }
        if (fast == null) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    static Node middleElement(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static Node middleforeven(Node head) {
        // in this case left middle is answer
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    static void cycle2() {
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(0);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;

        Node slow = a;
        Node fast = a;
        if (a == null) {
            System.out.println("-1");
            return;
        }
        if (a.next == null) {
            System.out.println("-1");
            return;
        }
        while (fast != null && fast.next != null) {
            if (slow == null) {
                System.out.println("-1");
                return;
            }
            slow = slow.next;
            if (fast.next == null) {
                System.out.println("-1");
                return;
            }
            fast = fast.next.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            System.out.println("-1");
        }
        Node temp = a;
        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;

        }
        System.out.println(slow.val);

    }
    
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(9);
        // Node e= new Node(45);
        a.next = b;
        b.next = c;
        c.next = d;
        // d.next=e;
        // display(a);
        // deleteNode(c);
        display(a);
        Node q = nthnode(a, 2);
        System.out.println(q.val);
        Node p = nthnode(a, 1);
        System.out.println(p.val);
        display(a);
        // a=removingnthNode(a, 4);
        display(a);
        Node s = middleElement(a);
        System.out.println(s.val);
        Node m = middleforeven(a);
        System.out.println(m.val);
        //cycle2();
        

    }

}

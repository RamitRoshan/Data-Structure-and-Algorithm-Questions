package LinkedList;


public class evidentlimitation {


    public static class Node{

        int data; //value
        Node next; // address of next node

        Node(int data){
            this.data = data;
        }
    }

      /*
        hme kuch nai krna ek value de rakha h hme last m
        wo value attach krna h.
        Tail nai de rakha h , only Head ek property h
         */

        //function
        public static void insertAtEnd(Node head, int val) {
            Node temp = new Node(val);
            Node t = head;
            while (t.next != null) {
                t = t.next;
            }
            t.next = temp;
        }

        public static void displayr(Node head) {
            if (head == null) return;
            System.out.print(head.data + " ");
            displayr(head.next);
        }


    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        a.next = b;
        b.next = c;    //5-> 3-> 9 8 16
        c.next = d;    //5-> 3-> 9-> 8 16
        d.next = e;
        
        insertAtEnd(a, 87);
        displayr(a);
        
    }
}

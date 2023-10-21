package LinkedList;

public class reverseList {
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }
    //below function is Node data type
    public static Node reverse(Node head){
        if(head.next == null) return head; //base case
        Node newHead = reverse(head.next);
        head.next.next = head; //interchanging the connections i.e (work)
        head.next = null;
        return newHead;
    }


    public static void display(Node head){
        if(head == null) {//base case
            System.out.println();
            return;
        }
        System.out.print(head.val+" "); //work
        display(head.next); //call

    }
//    //in recursion for  reverse we use base case-> call-> work
//    public static void displayrev(Node head){
//        if(head == null) return; //base case
//        System.out.print(head.val+" "); //work
//        displayrev(head.next); //call
//    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);

        a.next =b;
        b.next = c;
        c.next = d;
        d.next = e;
        // displayrev(a);

        display(a);
        a = reverse(a);
        display(a);
    }
}

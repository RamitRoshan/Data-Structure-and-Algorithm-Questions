package LinkedList;

public class RemoventhNodeFromEnd {

    public static Node deleteNthFromEnd(Node head, int n){
        Node slow = head;
        Node fast = head;
        //here hme fast ko agge leke jana hai
        for(int i=1; i<=n; i++){
            fast = fast.next;
        }

        if(fast ==null){
            head = head.next;
            return head;
        }
        while(fast.next != null){ //fast ko tail tk leke jana h, not null tk
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
        }
    }
    //make a display function to print linkedlist
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next =e;
        e.next = f;

        display(a);

       a = deleteNthFromEnd(a,6);
        display(a);



    }
}

package LinkedList;

public class deleteAtindex {

    public static class Node{

        int data; //value
        Node next; // address of next node

        Node(int data){
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        //DELETE-ATINDEX
        void deleteAt(int idx) {

            //for deleting index=0
            if(idx==0){
                head = head.next;
            }
           Node temp = head;
            for (int i = 0; i <= idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;//used this, so that tail can exactly change after deleting last index

        }

       void display(){ //making function
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
       }

    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        Node a = new  Node(5);
       Node b = new  Node(3);
        Node c = new  Node(9);
        Node d = new  Node(8);
        Node e = new  Node(16);

        a.next = b;
        b.next = c;    //5-> 3-> 9 8 16
        c.next = d;    //5-> 3-> 9-> 8 16
        d.next = e;

        ll.head = a;
        ll.tail = e;

        ll.deleteAt(0);
        ll.display();
//        System.out.println();
//        System.out.println(ll.tail.data);
    }
}

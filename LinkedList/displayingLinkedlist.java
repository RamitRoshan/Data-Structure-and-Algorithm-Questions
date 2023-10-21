package LinkedList;

public class displayingLinkedlist {


    //using function to display Linkedlist
    public static void display(Node1 head ){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static class Node1{
        //data and next are two attributes of Node
        int data; //value
        Node1 next; // address of next node

        Node1(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node1 a = new Node1(5);
        Node1 b = new Node1(3);
        Node1 c = new Node1(9);
        Node1 d = new Node1(8);
        Node1 e = new Node1(16);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

//        //displaying a linkedlist in a simple way
//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);

//
//        //here we know the size of node, jb aasa hota nai h.
//        // we will only know the head node
//        Node1 temp = a;
//        for (int i=1; i<=5; i++){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }

//        //so Displaying the Linkedlist on the basis, of Head node
//        Node1 temp = a;
//        while (temp != null){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }

        display(a);
        System.out.println();
        display(a);
    }
}

package LinkedList;

public class basicsll {

    public static class Node{
        //data and next are two attributes of Node
        int data; //value
        Node next; // address of next node

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // we have to link these no. with eachother
        //5 3 9 8 16
        a.next = b;   //5 -> 3 9 8 16
        b.next = c;    //5-> 3-> 9 8 16
        c.next = d;    //5-> 3-> 9-> 8 16
        d.next = e;    //5-> 3-> 9-> 8-> 16 , now this all is linked and ye linkedlist ban gaya
        System.out.println(b);




    }
}

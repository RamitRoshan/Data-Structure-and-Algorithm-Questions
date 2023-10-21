package LinkedList;

public class insertatHead {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtBeginning(int val) {
            Node temp = new Node(val);
            if (head == null){ //empty list
                head = temp;
                tail= temp;
            }
            else { //non empty
                temp.next = head;
                head = temp;
            }
        }



        void display(){ //making function
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtBeginning(13); //print 13
        ll.display();

        ll.insertAtBeginning(16); //print 16-> 13
        ll.display();




    }

}
package LinkedList;

public class InsertMethod {

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

       //for insert at End
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if (head == null){
                head = temp; //jo nya node bnaya tha use head man lo

            }
            else{
                tail.next = temp;
                // tail = temp; //tail = temp if and else dono m likhe h
                /* to shortcut hme ese out of curly bracec 1 time likh skte h */
            }
            tail = temp;
        }

     //Insert for head
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


        //InsertMethod
        void insertAt(int idx, int val){
            Node t = new Node(val); //new node, i.e this is going to add in somewhere
            Node temp = head;  //this temp is used to travel or agge badhana

            if(idx == size()){
                insertAtEnd(val);
                return;
            } else if (idx==0) {
                insertAtBeginning(val);
                return;
            } else if (idx<0 || idx>size()) {
                System.out.println("wrong answer");
                return; //khatam
            }
            //will use for-loop ,because we will travel
            //hme temp ko idx-1 tk leke jaana hai .. index se pehle
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }


        void display() { //making function
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        //making a fuction for size which is integer
        int size(){
            Node temp = head;
            int count =0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll= new linkedlist();

        ll.insertAtEnd(2);

        ll.insertAtBeginning(4);
        ll.insertAtBeginning(11); //print 11
      //  ll.display();
        ll.insertAtBeginning(23);
        ll.insertAtBeginning(177); //print 177-> 23 -> 11->4 ->2
        ll.display();

        //printing insert method
        ll.insertAt(2,10); //print 177-> 23 ->10-> 11->4-> 2
        ll.display();

        ll.insertAt(6,102); //print 177-> 23 ->10-> 11->4-> 2-> 102
        ll.display(); //index=6 i.e at end

        //here tail = 4 aa raha, jbki ese 102 aana chahiye
        System.out.println(ll.tail.data);
        //now we make a function inside insertAt() , and it will show exact answer now


        //insert at index=0
        ll.insertAt(0,1);
        ll.display();
    }
}

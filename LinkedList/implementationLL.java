package LinkedList;

public class implementationLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
         Node tail = null;
        //making function under class
        void insertAtEnd(int val){
            /*function m public static kyu nai lga raha
            kyuki already class m public static likhi h
            and we are making function under class, to bar bar likhne ki jrurat nai h
             */
            Node temp = new Node(val);
             if (head == null){
                 head = temp; //jo nya node bnaya tha use head man lo
                // tail = temp;
             }
             else{
                 tail.next = temp;
                // tail = temp; //tail = temp if and else dono m likhe h
                 /* to shortcut hme ese out of curly bracec 1 time likh skte h */
             }
             tail = temp;
        }

        //Atthebeginning
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

        //INSERT METHOD
        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx==size()){
                insertAtEnd(val);
                return; //it ,means function khatam
            }
            else if (idx==0){
                insertAtBeginning(val);
                return;
            }
            else if(idx<0 || idx>size()){
                System.out.println("wrong index");
                return;
            }
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next =t;
        }

        //Making a function for getElement method
        int getAt(int idx){
            //write this if statement if your index<0
            //and if you are writing index which is not present in thius
            //then it will return -1.
            if(idx<0 || idx>size()){
                System.out.println("wrong index");
                return -1;
            }
            Node temp = head;
            for (int i=1; i<=idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }



        void display(){ //making function
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
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

        /* In array we write this type to implement array
         */
       // int[] arr = new int [5];
        //like this we wants to make Linkedlist
        //we can make it using OOPS i.e user defined datatype
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4); //4
       // ll.display();
        ll.insertAtEnd(5); //4 5
      //  ll.display();
       // System.out.println(); //used for space
       // System.out.println(ll.size());

        ll.insertAtEnd(12); //4->5->12
      //  ll.display(); //it is used to print above 4 5 12

        ll.insertAtBeginning(13); //print 13->4->5-> 12
     //   ll.display();
      //  System.out.println();
        ll.insertAt(4,10); //print 13->4-> 10-> 5-> 12
      //  ll.display();

        //System.out.println(); //using just for space and next line
        ll.insertAt(0, 100);
        ll.display();

//        //printing getElement method
//        System.out.println();
//        System.out.println(ll.getAt(2));




    }
}

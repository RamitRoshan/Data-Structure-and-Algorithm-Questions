package LinkedList;

public class nthNodeFromEnd {
//    //return type hm "Node" bhi rakh skte hai. like we do int, char, float
//    public static Node nthNode(Node head, int n){ //n means have to find nth node from last
//        int size=0;
//        //we are going to find size.
//        Node temp = head;
//        while(temp != null){
//            size++;
//            temp = temp.next;
//        }
//        //using formula: (m-n+1)
//        int m = size - n + 1;
//        //now we have to find, mth node from start
//        //here 4 node chahiye to 3 bar(m-1) loop challaige
//        temp = head;
//        for(int i=1; i<=m-1; i++){
//            temp = temp.next;
//        }
//        return temp;
//    }

    //2nd method using One traversal
    public static Node nthNode2(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i=1; i<=n; i++){
            fast = fast.next;
        }
        while(fast!= null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next =b;
        b.next=c;
        c.next =d;
        d.next = e;
        e.next = f;
        //100 13 4 5 12 10
//        Node q = nthNode(a,3); //a=head node
        Node q = nthNode2(a,3); //a=head node
        //ye mujhe nth node nikal k dega agar mujhe head node de rakha h to
        System.out.println(q.data);
    }
}

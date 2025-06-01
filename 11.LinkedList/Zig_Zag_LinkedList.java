public class Zig_Zag_LinkedList {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null; 
        }
    }
    public static Node head;
    public static Node tail;

    //Function to add node at last of LinkedList
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //function to reverse the LinkedList
    public Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node follow;
        while(curr != null){
            follow = curr.next;
            curr.next = prev;
            prev = curr;
            curr = follow;
        }
        return prev;
    }

    //Function to get Mid Node of LinkedList
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //Function to Print the Linkedlist
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    //Function to align the nodes in Zig-Zag order
    public void zig_zag(){
        Node mid = getMid(head);
        Node secondhalf = reverse(mid.next);
        mid.next = null;//cut the head node in half
        Node firsthalf = head;
        Node LH,RH;//Dummy nodes to track next nodes
        while(firsthalf != null && secondhalf != null){
            LH = firsthalf.next;//To store next value of Left half
            RH = secondhalf.next;//To store next value of Right half
            firsthalf.next = secondhalf;
            secondhalf.next = LH;
            firsthalf = LH;
            secondhalf = RH;
        }
    }

    public static void main(String args[]){
        Zig_Zag_LinkedList ll =new Zig_Zag_LinkedList();
        ll.addLast(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.print();
        ll.zig_zag();
        ll.print();
    }
}

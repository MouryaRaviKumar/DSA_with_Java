//Program to take  input nodes and reverse the LinkedList
public class Reverse_LinkedList {
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

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    //Function to  reverse the LinkedList 
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node follow;
        while(curr!=null){
            follow = curr.next; 
            curr.next = prev;
            prev = curr;
            curr = follow;
        }
        head = prev;
    }
    public static void main(String args[]){
        Reverse_LinkedList ll = new Reverse_LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.reverse();
        ll.print();
    }
}

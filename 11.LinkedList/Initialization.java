//This File Contains Creation of LinkedList ,Adding of Nodes at First,Adding of Nodes at Last and Printing of the LinkedList
public class Initialization {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    //Function to print the LinkedList
    public  void traveseList(){
        if(head == null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    //To add Nodes at front of the LinkedList
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //To add Nodes at last of the LinkedList
    public void AddLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    //Function to Add node in Middle
    public void addMiddle(int index,int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String args[]){
        Initialization ll = new Initialization();
        ll.traveseList();
        ll.addFirst(2);
        ll.traveseList();
        ll.addFirst(1);
        ll.traveseList();
        ll.AddLast(3);
        ll.traveseList();
        ll.AddLast(4);
        ll.traveseList();
    }
}

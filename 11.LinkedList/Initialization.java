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

    public static void traveseList(Node head){
        while(head!=null){
            System.out.println(head.data+" ");
            head = head.next;
        }
    }

    
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void AddLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static void main(String args[]){
        Initialization ll = new Initialization();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.AddLast(3);
        ll.AddLast(4);
        traveseList(head);
    }
}

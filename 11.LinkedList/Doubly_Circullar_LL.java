public class Doubly_Circullar_LL {
    public  class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;

    public  void  addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            tail.next = head;
            
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    public static void main(String args[]){
        Single_Circular_LL ll = new Single_Circular_LL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        Node temp = head;
        do{
            System.out.print(temp.data+"->");
            temp = temp.next;
        }while(temp!=head);
        
    }
}

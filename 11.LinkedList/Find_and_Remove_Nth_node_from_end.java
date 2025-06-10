public class Find_and_Remove_Nth_node_from_end{
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
    public  static int size;

    //Function to add nodes at last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //Function to  print the LinkedList
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    //Function to remove Nth Node from the end
    public void RemoveNthNodeFromEnd(int n){
        if(n == size){
            head = head.next;
            return;
        }
        Node prev = head;
        int index = size-n+1;
        for(int i = 0;i<index-2;i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }
    public static void main(String args[]){
        Find_and_Remove_Nth_node_from_end ll = new Find_and_Remove_Nth_node_from_end();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.RemoveNthNodeFromEnd(2);
        ll.print();
    }
}
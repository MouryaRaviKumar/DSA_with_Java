public class RemoveNodes {
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
    public static int size;

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
        size++;
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
        size++;
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
        size++;
        Node temp = head;
        int i = 0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //Function to remove node at first of LinkedList
    public int RemoveFirst(){
        if(size == 0){
            System.out.println("LinkedLIst is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;//Assign head to the next Node and java Garbage collector deletes the first Node;
        size--;
        return val;
    }
    
    //Function to remove Node from last of linkedlist
    public int RemoveLast(){
        if(size == 0){
            System.out.println("LInkedList is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i = 0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static void main(String args[]){
        RemoveNodes ll = new RemoveNodes();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.traveseList();
        ll.RemoveFirst();
        ll.traveseList();
        ll.RemoveLast();
        ll.traveseList();
    }
}
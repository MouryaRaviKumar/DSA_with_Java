public class ReverseDLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public Node head;
    public Node tail;
    public int size;

    //Function to add a Node at last of Double LinkedList
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    //Function to print a Double LinkedList
    public void print(){
        Node temp = head;
        if(head != null){
            
            while(temp != null){
                System.out.print(temp.data+"<->");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }

    //Function to Reverse a Doubly-LinkedList
    public void reverseDll(){
        Node curr = head;
        Node prev = null;
        Node follow;
        while(curr != null){
            follow = curr.next;
            curr.next = prev;
            curr.prev = follow;
            prev = curr;
            curr = follow;
        }
        head = prev;
    }

    public static void main(String args[]){
        ReverseDLL dll = new ReverseDLL(); 
        
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(6);
        dll.print();
        dll.reverseDll();
        dll.print();
    }
}


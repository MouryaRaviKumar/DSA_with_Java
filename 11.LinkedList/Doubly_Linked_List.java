public class Doubly_Linked_List {
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

    //Function to add a Node at first of Double LinkedList
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

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

    //Function to Remove a Node at first of Double LinkedList
    public void removeFirst(){
        if(head == null){
            System.out.println("DLL is empty");
            return;
        }
        if(size == 1){
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    //Function to Remove a Node at Last of Double LinkedList
    public void removeLast(){
        if(head == null){
            System.out.println("DLL is empty");
            return;
        }
        if(size == 1){
            head = tail = null;
            size--;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
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

    public static void main(String args[]){
        Doubly_Linked_List dll = new Doubly_Linked_List();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(6);
        dll.addLast(7);
        dll.print();
        dll.removeFirst();
        dll.removeLast();
        dll.print();
    }
}

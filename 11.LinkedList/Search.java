public class Search{
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
    public int size;
    
    

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
    
    //Function to Search a value in LinkedLList using Iterative method
    public int iterative(int key){
        Node temp = head;
        for(int i = 0;i<size;i++){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
    
    //Function  to Search value in Linkedlist using recursive method
    public int searchKey(Node head, int key,int i){
        if(i > size-1){
            return -1;
        }
        if(head == null){
            return Integer.MIN_VALUE;
        }
        if(head.data == key){
            return i;
        }
        return searchKey(head.next, key, i+1);
    }
    public static void main(String args[]){
        Search ll = new Search();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.AddLast(3);
        ll.AddLast(4);
        System.out.println(ll.size);
        System.out.println(ll.iterative(4));
        System.out.println(ll.searchKey(head,4,0));
    }
}

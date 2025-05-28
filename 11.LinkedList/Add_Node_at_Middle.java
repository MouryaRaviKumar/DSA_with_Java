public class Add_Node_at_Middle {
    
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node  head;
    public static Node tail;

    public void addMiddle(int index,int data){
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

    public void AddLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public  void print(){
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

    public static void main(String args[]){
        Add_Node_at_Middle ll = new Add_Node_at_Middle();
        ll.AddLast(0);
        ll.AddLast(1);
        ll.AddLast(2);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.addMiddle(2, 7);
        ll.print();
    }
}

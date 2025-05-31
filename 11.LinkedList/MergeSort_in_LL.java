public class MergeSort_in_LL{
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

    //Function to add nodes at last of LinkedList
    public void AddLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    
    //Function to get mid and right part of linkedList
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //Function to perform merge Operation
    private Node merge(Node head1,Node head2){
        Node MergedLL = new Node(-1);
        Node temp = MergedLL;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return MergedLL.next;
    }

    //Function to perform mergeSort
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid = getMid(head);
        Node righthead = mid.next;
        mid.next = null;
        Node lefthalf = mergeSort(head);
        Node Righthalf = mergeSort(righthead);
        return merge(lefthalf,Righthalf);
    }
    
    //Function to print the LinkedList
    public void Print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        MergeSort_in_LL ll = new MergeSort_in_LL();
        ll.AddLast(6);
        ll.AddLast(3);
        ll.AddLast(7);
        ll.AddLast(2);
        ll.AddLast(9);
        ll.AddLast(4);
        ll.AddLast(1);
        ll.AddLast(5);
        ll.AddLast(8);
        ll.Print();
        head = ll.mergeSort(head);
        ll.Print();
    }
}
public class Delete_N_Nodes_after_M_nodes{
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

    //Function to print the LinkedList
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }

        System.out.println("Null");
    }

    //Function to add Nodes at last of LinkedList
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //Function to Delete N nodes after every M nodes -O(N(m*n))
    public Node deleteNodes(Node head,int m,int n){
        Node curr = head;
        Node t;
        int count;
        while(curr != null){
            //first skip  M -no of nodes
            for(count = 1;count < m && curr != null ; count++){
                curr = curr.next;
            }
            if(curr == null){
                return head;
            }
            t = curr.next;
            //Dlete N- no of nodes
            for(count = 1;count <= n && t!=null;count++){
                Node temp = t;
                t = t.next;
                temp = null;
            }
            curr.next = t;
            curr = t;

        }
        return head;
    }

    public static void main(String args[]){
        Delete_N_Nodes_after_M_nodes ll = new Delete_N_Nodes_after_M_nodes();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.print();
        ll.deleteNodes(head, 2, 2);
        ll.print();
    }
}

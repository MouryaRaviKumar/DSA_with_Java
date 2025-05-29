public class PalindromeLL {
    public  class Node{
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

    //Function to add nodes at last in LinkedList
    public  void addLast(int data){
        Node newNode = new  Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //Function to check whether a LinkedList is a palindrome or not
    public boolean isPalindrome(Node head){
        if(head == null || head.next == null){
            return true;
        }
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node SecondHalf = reverse(slow);
        Node firsthalf = head;
        Node temp = SecondHalf;

        while(temp!=null){
            if(firsthalf.data!=temp.data){
                return false;
            }
            firsthalf = firsthalf.next;
            temp = temp.next;
        }
        return true;
    }
    
    //Functon too reverse a LinkedList
    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node follow;
        while(curr!=null){
            follow = curr.next;
            curr.next = prev;
            prev = curr;
            curr = follow;
        }
        return prev;
    }

    public static void main(String args[]){
        PalindromeLL ll = new PalindromeLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        boolean ans = ll.isPalindrome(head);
        System.out.println(ans);
    }
}

public class Remove_Cycle_in_LL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    //Function to detect a cycle/Loop
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;//+1 step
            fast = fast.next.next;//+2 steps
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    //Function to remove a loop using slow-fast approach with slight modification
    public static void Remove(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }

        //check whether the cycle exists
        if(cycle == false){
            return;
        }

        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;//previous node to track last Node 
            slow = slow.next;//+1
            fast = fast.next;//+1
        } 
        prev.next = null;//making the last node to point at null value
    }

    public static void main(String args[]){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;
        System.out.println(isCycle());
        Remove();
        System.out.println(isCycle());
    }
}

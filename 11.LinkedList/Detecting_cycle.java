public class Detecting_cycle{
    public static class Node{//using static for giving static values into nodes (see main u will understand it)
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    
    //Function to detect whether there is a cycle in the LinkedList or not using Slow-Fast approach
    //Floyd's Cycle FInding Algorithm
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
    public static void main(String args[]){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        //1->2->3->1
        System.out.println(isCycle());
    }
}
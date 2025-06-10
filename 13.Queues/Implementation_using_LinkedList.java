public class Implementation_using_LinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        Node head = null;
        Node tail = null;

        public boolean isEmpty(){
            return head == null && tail == null;
        }

        public void addLast(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;;
            tail = newNode;
        }

        public int removefirst(){
            if(head == null){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }
            return front;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

        public static void main(String args[]){
            Queue q = new Queue();
            q.addLast(1);
            q.addLast(2);
            q.addLast(3);
            q.addLast(4);
            
            q.removefirst();
            q.removefirst();

            while(!q.isEmpty()){
                System.out.println(q.removefirst());
            }
        }
    }
}

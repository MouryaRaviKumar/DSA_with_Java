public class Push_at_Bottom {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class stackB {
        Node head = null;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        // Recursive method to push at bottom
        private Node pushBottomRecursive(Node node, int data) {
            if (node == null) {
                return new Node(data);
            }
            node.next = pushBottomRecursive(node.next, data);
            return node;
        }

        public void pushAtBottom(int data) {
            head = pushBottomRecursive(head, data);
        }
    }

    public static void main(String args[]) {
        stackB s = new stackB();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pushAtBottom(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

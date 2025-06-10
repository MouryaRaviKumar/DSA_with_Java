import java.util.ArrayList;
public class Implementation {
    static class Stack{
        static ArrayList <Integer> List = new ArrayList<>();

        public static boolean isEmpty(){
            return List.size() == 0;
        }

        public static void push(int data){
            List.add(data);
        }

        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = List.get(List.size()-1);
            List.remove(List.size()-1);
            return top;
        }

        
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return List.get(List.size()-1);
        }

    }

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

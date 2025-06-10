import java.util.ArrayList;

public class Push_at_bottom{
    public static class stackB{
        static ArrayList<Integer> List = new ArrayList<>();

        public static boolean isEmpty(){
            return List.size() == 0;
        }

        public static void push(int data){
            List.add(data);
        }

        public static int pop(){
            if(List.size()==0){
                return -1;
            }
            int top = List.get(List.size()-1);
            List.remove(List.size()-1);
            return top;
        }

        public static int peek(){
            if(List.size()==0){
                return -1;
            }
            return List.get(List.size()-1);
        }

        public static void pushBottom(int data){
            List.add(0,data);
        }
    }
    public static void main(String args[]){
        stackB s = new stackB();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pushBottom(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
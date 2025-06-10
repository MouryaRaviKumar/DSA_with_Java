import  java.util.*;
public class Impllementation_using_Collectionns {
    public static void main(String argss[]){
        Queue<Integer> q = new  LinkedList<>();//refer Java collections framework to know why we used LinkedList keyword
        //we can also use priorityqueue and Arraydeque to performm this program
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        q.remove();
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

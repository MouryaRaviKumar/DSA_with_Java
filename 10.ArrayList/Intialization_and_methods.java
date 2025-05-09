import java.util.ArrayList;
import java.util.Collections;

public class Intialization_and_methods{
    
    public static void main(String args[]){

        //Intialization of ArrayList 
        ArrayList <Integer> List =new ArrayList<>();
        //ArrayList <Boolean>  list2 = new ArrayList<>();
        //ArrayList <String> list3 =new ArrayList<>();

        //Adding of Values into ArrayList
        List.add(1);//O(1)
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);

        //Ading values at a particular index by pushing the values to its right
        List.add(1,10);//O(n)


        System.out.println(List);//To print the whole List
        System.out.println(List.get(2));//To retrieve a value at a specific index

        List.remove(4);//To remove the value at particular Index
        System.out.println(List);

        List.set(2, 10);//To Update the value at particular index with another value(Replacing)" MAINLY USED FOR SWAPING"
        System.out.println(List);

        System.out.println(List.contains(3));//To find whether the ArrayList contains the given value(Boolean answer)
        System.out.println(List.contains(5));

        System.out.println(List.size());//To find the Length of the ArrayList

        //Print the ArrayList in reverse order
        int n=List.size();
        for(int i=n-1;i>=0;i--){
            System.out.print(List.get(i) +" ");
        }
        System.out.println();

        //Largest element in the ArrayList
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(List.get(i)>largest){
                largest=List.get(i);
            }
        }
        System.out.println(largest);

        //Swapping of Two numbers
        System.out.println(List);
        {
        Integer temp=List.get(3);
        List.set(3,List.get(1));
        List.set(1,temp);;
        }
        System.out.println(List);

        //Sorting the ArrayList in Ascending order using the inbuilt methods
        Collections.sort(List);//Sorts the ArrayList in Ascending order
        System.out.println(List);

        Collections.sort(List,Collections.reverseOrder());// Sort the ArrayList in Descending order
        System.out.println(List);

    }
}
import java.util.ArrayList;

public class TwoD_ArrayList {

    public static void main(String args[]){

        ArrayList <ArrayList <Integer>> Main=new  ArrayList<>();// ArrayList as Type which makes it possible to perform as a matrix
        ArrayList <Integer> One= new ArrayList<>();
        ArrayList <Integer> Two= new ArrayList<>();

        One.add(11);
        One.add(12);
        One.add(13);
        Two.add(21);
        Two.add(22);
        Two.add(23);

        Main.add(One);
        Main.add(Two);

        System.out.println(Main);

        // To iterate every value in a 2D ArrayList
        for(int i=0;i<Main.size();i++){
            ArrayList <Integer> curr=Main.get(i);
            for(int j=0;j<curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        
        }
    }
    
}

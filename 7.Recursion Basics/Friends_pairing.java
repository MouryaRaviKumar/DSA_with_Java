public class Friends_pairing {
    
    public static int pairscount(int n){
        if(n == 0 | n == 1 | n == 2){
            return n;
        }
        int single = pairscount(n-1);
        int duo = pairscount(n-2);
        int duoChoice = (n-1) * duo;
        int count = single + duoChoice;
        return count;
    }
    public static void main(String args[]){
        int n = 4;
       System.out.println(pairscount(n));
    }
}

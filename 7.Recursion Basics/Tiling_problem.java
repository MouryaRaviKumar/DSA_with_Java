public class Tiling_problem{
    //Function to count the no of ways tile can be placed in a 2*n area
    public static int Tiles(int n){
        if(n == 0 | n == 1){//Base case
            return 1;
        }
        int fnm1 = Tiles(n-1);//Tile placed vertical
        int fnm2 = Tiles(n-2);//Tile placed horizontal
        int count = fnm1 + fnm2;//Total no of ways
        return count;
    }
    public static void main(String args[]){
        int n = 4;
        int ans = Tiles(n);
        System.out.println(ans);
    }
}
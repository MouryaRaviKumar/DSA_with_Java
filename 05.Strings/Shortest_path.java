public class Shortest_path {
    //Direction question
    public static float displacement(String str){
        int x=0;
        int y=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y++;//To upward direction
            }
            else if(str.charAt(i)=='S'){
                y--;//To downward direction
            }else if(str.charAt(i)=='W'){
                x--;//To left direction
            }
            else {
                x++;//To right direction
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float) Math.sqrt(x2+y2);//formula for displacement
    }
    
    public static void main(String args[]){
        String str="WNEENESENNN";
        System.out.println(displacement(str));
    }
    
}

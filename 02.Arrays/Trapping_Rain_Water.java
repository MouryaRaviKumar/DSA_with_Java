public class Trapping_Rain_Water {

    public static void Trapping_water(int heights[]){
        int n=heights.length;

        //leftmax 
        int leftmax[]=new int[n];
        leftmax[0]=heights[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(heights[i],leftmax[i-1]);
        }

        //Rightmax
        int rightmax[]=new int[n];
        rightmax[n-1]=heights[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(heights[i],rightmax[i+1]);
        }

        int trappedwater=0;
        
        //Calculating waterlevel
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(rightmax[i],leftmax[i]);
            //waterlevel-height=trappedwater
            trappedwater=trappedwater+waterlevel-heights[i];
        }

        System.out.println(trappedwater);
        
    }

    public static void main(String args[]){

        int heights[]={0,1,0,2,1,0,1,3,2,1,2,1};
        Trapping_water(heights);
    }
    
}

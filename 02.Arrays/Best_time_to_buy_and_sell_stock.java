public class Best_time_to_buy_and_sell_stock{
    //Function to find Best time to buy and sell stock -- BruteForce --0(n^2) TIme complexity
    public static int profit(int prices[]){
        int currprofit = 0;
        int maxprofit = 0;
        for(int i = 0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                currprofit = prices[j] - prices[i];
                maxprofit = Math.max(currprofit,maxprofit);
            }
        }
        return maxprofit;
    }
    //function with optimized approach --0(n) Time complexity
    public static int maxProfit(int[] prices) 
    {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i =0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }
            else{
                maxProfit = Math.max(maxProfit,prices[i]-minPrice);
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
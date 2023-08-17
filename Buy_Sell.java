package Array;

public class Buy_Sell {
    public static int buyAndsellstock(int price[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<price.length;i++){
            if(buyprice<price[i]){
                //profit
                int profit=price[i]-buyprice;// today's profit
                maxprofit=Math.max(maxprofit, profit);
            }else{
                buyprice=price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]) {
        
     
        int a[]={7,1,5,3,6,4};
        System.out.println(buyAndsellstock(a));
    }
    
    }

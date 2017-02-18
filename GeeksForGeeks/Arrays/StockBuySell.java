/*
18/2/2017
Stock Buy Sell to Maximize Profit

http://www.geeksforgeeks.org/stock-buy-sell/

input = {100, 180, 260, 310, 40, 535, 695}
Buy on day : 0   Sell on day: 3
Buy on day : 4   Sell on day: 6 

Time complexity O(n) 

If there is need to return , back the index , the same could be achieved returning a List 
ex. class Intervals{
    int buy;
    int sell;
}
*/

class StockBuySell{

    void stockBuySell(int[] price,int n){

            if(n==1)
                return;


            int i=0,j=0,sum=0,min=0,max=0;
            
            StringBuilder bru = new StringBuilder();

            while(i<n-1){

                    if(price[i]<price[i+1]){

                        min = i;
                        while((price[i]<price[i+1])){
                            max=i+1;
                            i++;
                            if(i==n-1)
                                break;
                        }
                        bru.append("Buy on day : " + min + "   Sell on day : " + max + "\n");
                    }


                i++;
            }

            System.out.println(bru.toString());

    }

    public static void main(String[] args){

            StockBuySell stock = new StockBuySell();

            int[] price = {100, 180, 260, 310, 40, 535, 695};
            int n = price.length;

            stock.stockBuySell(price,n); 
    }

}
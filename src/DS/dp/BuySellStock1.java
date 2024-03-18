package DS.dp;

public class BuySellStock1 {
    public static void main(String[] args) {
        BuySellStock1 buySellStock1 = new BuySellStock1();
        System.out.println("The max Profit is::");
        System.out.print(buySellStock1.maxProfit(new int []{7,1,5,3,6,4}));
    }

    public int maxProfit(int[] prices) {
        return calcProfit(prices,1,0,prices[0]);
    }

    public int calcProfit(int[] price, int day, int profit, int buyPrice) {
        if(day == price.length-1) {
            return Math.max(profit,  price[day] - buyPrice);
        }
        int diff = price[day] - buyPrice;
        profit = Math.max(profit, diff);
        buyPrice = Math.min(buyPrice, price[day]);
        return calcProfit(price,++day, profit,buyPrice);
    }

}

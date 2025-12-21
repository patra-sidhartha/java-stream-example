package com.st.normal.array.special;

public class BuySellTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Concept: Maintain the minimum price seen so far and calculate the potential profit for each day.
//		Test Data: {7, 1, 5, 3, 6, 4}
//		Optimal: Buy at 1, Sell at 6. Profit = 5.

		maxProfitInStockOne(new int[] {7, 1, 5, 3, 6, 4});

//		Concept: Greedy approach. Capture every price increase between consecutive days.
//		Test Data: {1, 5, 2, 3, 7}
//		Optimal: Buy at 1, Sell at 5 (Profit 4) + Buy at 2, Sell at 7 (Profit 5). Total Profit = 9.

		maxProfitInStockMultiple(new int[] {1, 5, 2, 3, 7});
	}
	
	public static void maxProfitInStockOne(int prices[]) {
//		int[] prices = {7, 1, 5, 3, 6, 4};
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for(int price: prices) {
			minPrice = Math.min(minPrice, price);
			maxProfit = Math.max(maxProfit, price-minPrice); 
		}
		System.out.println("maxProfit:" + maxProfit);
	}
	
	public static void maxProfitInStockMultiple(int prices[]) {
//		int[] prices = {1, 5, 2, 3, 7};
		int totalProfit = 0;

		for(int i=1; i<prices.length; i++) {
			if(prices[i] > prices[i-1]) {
				totalProfit += prices[i] - prices[i-1];
			}
		}
		System.out.println("totalProfit:" + totalProfit);
	}
}

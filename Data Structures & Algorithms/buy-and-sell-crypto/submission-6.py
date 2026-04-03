class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        Profit = 0
        minBuy = prices[0]

        for sell in prices:
            Profit = max(Profit, sell - minBuy)
            minBuy = min(minBuy, sell)
        return Profit
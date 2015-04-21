import java.util.List;

public class ProfitFinder {

    public Integer getMaxProfit(List<Integer> stockPricesYesterday) {
        int minPrice = stockPricesYesterday.get(0);
        int maxProfit = getPotentialProfit(stockPricesYesterday.get(0), stockPricesYesterday.get(1));

        for (Integer currentPrice : stockPricesYesterday.subList(1, stockPricesYesterday.size())) {

            maxProfit = Math.max(getPotentialProfit(minPrice, currentPrice), maxProfit);

            minPrice = Math.min(currentPrice, minPrice);
        }
        return maxProfit;
    }

    private int getPotentialProfit(int minPrice, Integer currentPrice) {
        return currentPrice - minPrice;
    }
}

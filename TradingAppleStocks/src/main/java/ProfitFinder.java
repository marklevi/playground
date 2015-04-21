import java.util.List;

public class ProfitFinder {

    public Integer getMaxProfit(List<Integer> stockPricesYesterday) {
        int maxProfit = 0;

        int earlierTime = 0;
        for (Integer earlierPrice : stockPricesYesterday) {
            for (Integer laterPrice : stockPricesYesterday.subList(earlierTime, stockPricesYesterday.size())) {

                int potentialProfit = laterPrice - earlierPrice;

                maxProfit = Math.max(potentialProfit, maxProfit);

            }
            earlierTime++;
        }
        return maxProfit;
    }
}

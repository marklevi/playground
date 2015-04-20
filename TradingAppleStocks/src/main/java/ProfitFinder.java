import java.util.List;

public class ProfitFinder {

    public Integer getMaxProfit(List<Integer> stockPricesYesterday) {
        int maxProfit = 0;

        for (int i = 0; i < stockPricesYesterday.size(); i++) {

            for (int j = 0; j < stockPricesYesterday.size(); j++){
                int minBuyTime = Math.min(i, j);
                int maxBuyTime = Math.max(i, j);

                final Integer earlierPrice = stockPricesYesterday.get(minBuyTime);
                final Integer laterPrice = stockPricesYesterday.get(maxBuyTime);

                int potentialProfit = laterPrice - earlierPrice;

                if(potentialProfit > maxProfit){
                    maxProfit = potentialProfit;
                }
            }
        }
        return maxProfit;
    }
}

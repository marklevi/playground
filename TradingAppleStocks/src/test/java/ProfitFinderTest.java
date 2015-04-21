import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ProfitFinderTest {
    @Test
    public void FindProfitGivenAnArray() throws Exception {
        List<Integer> stockPricesYesterday = new ArrayList<Integer>();
        stockPricesYesterday.add(500);
        stockPricesYesterday.add(520);
        stockPricesYesterday.add(550);
        stockPricesYesterday.add(530);

        final ProfitFinder profitFinder = new ProfitFinder();
        final Integer maxProfit = profitFinder.getMaxProfit(stockPricesYesterday);

        assertThat(maxProfit, is(50));
    }

    @Test
    public void FindProfitGivenYouMustBuyBeforeYouSell() throws Exception {
        List<Integer> stockPricesYesterday = new ArrayList<Integer>();
        stockPricesYesterday.add(550);
        stockPricesYesterday.add(520);
        stockPricesYesterday.add(500);
        stockPricesYesterday.add(510);

        final ProfitFinder profitFinder = new ProfitFinder();
        final Integer maxProfit = profitFinder.getMaxProfit(stockPricesYesterday);

        assertThat(maxProfit, is(10));
    }
}

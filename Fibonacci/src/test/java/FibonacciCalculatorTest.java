import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FibonacciCalculatorTest {

    @Test
    public void calculateNthFibonacci() throws Exception {

        final FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();

        final Integer number = fibonacciCalculator.compute(6);
        assertThat(number, is(8));
    }
}
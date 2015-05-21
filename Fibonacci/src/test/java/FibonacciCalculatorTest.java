import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FibonacciCalculatorTest {

    @Test
    public void calculateNthFibonacci() throws Exception {

        final FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();

        final Integer number = fibonacciCalculator.computeFib(4);
        assertThat(number, is(3));
    }
}
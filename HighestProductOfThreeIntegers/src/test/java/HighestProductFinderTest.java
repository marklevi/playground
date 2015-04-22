import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HighestProductFinderTest {
    @Test
    public void FindHighestProductUsingThreeIntegers() throws Exception {
        final List<Integer> integers = Arrays.asList(3, 2, 1, 5);
        final HighestProductFinder highestProductFinder = new HighestProductFinder();
        final Integer integer = highestProductFinder.findHighestProductOfThree(integers);
        assertThat(integer, is(30));
    }

    @Test
    public void FindHighestProductUsingThreeIntegersFromAnArrayOfFour() throws Exception {
        final List<Integer> integers = Arrays.asList(2, 3, 4, 5);
        final HighestProductFinder highestProductFinder = new HighestProductFinder();
        final Integer integer = highestProductFinder.findHighestProductOfThree(integers);
        assertThat(integer, is(60));
    }

    @Test
    public void FindHighestProductUsingThreeIntegersFromAnArrayWithNegatives() throws Exception {
        final List<Integer> integers = Arrays.asList(-10,-10, 1, 3, 2);
        final HighestProductFinder highestProductFinder = new HighestProductFinder();
        final Integer integer = highestProductFinder.findHighestProductOfThree(integers);
        assertThat(integer, is(300));
    }
}
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PossibilityCounterTest {
    @Test
    public void testName() throws Exception {
        final PossibilityCounter possibilityCounter = new PossibilityCounter();

        final int numPossibilities = possibilityCounter.change_possibilities_top_down(4, Arrays.asList(1, 2, 3));

        assertThat(numPossibilities, is(4));

    }
}
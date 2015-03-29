import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StackImplTest {

    @Test
    public void GivenTwoIntegersShouldPopTheFirstIntegerIn() throws Exception {
        final StackImpl stackImpl = new StackImpl();
        stackImpl.push(1);
        stackImpl.push(2);
        assertThat(stackImpl.pop(), is(2));
    }
}
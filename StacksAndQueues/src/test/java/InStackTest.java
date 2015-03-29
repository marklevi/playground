import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class InStackTest {

    @Test
    public void GivenTwoIntegersShouldPopTheFirstIntegerIn() throws Exception {
        final InStack inStack = new InStack();
        inStack.push(1);
        inStack.push(2);
        assertThat(inStack.pop(), is(2));
    }
}
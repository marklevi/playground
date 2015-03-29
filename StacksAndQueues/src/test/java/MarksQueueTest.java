import exceptions.NoElementInTheQueueException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MarksQueueTest {

    private MarksQueue marksQueue;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        marksQueue = new MarksQueue(new InStack(), new OutStack());
    }

    @Test
    public void ShouldDequeueTheFirstNumberThatWasEnqueued() throws Exception {
        marksQueue.enqueue(0);
        marksQueue.enqueue(1);
        marksQueue.enqueue(2);

        assertThat(marksQueue.dequeue(), is(0));
        assertThat(marksQueue.dequeue(), is(1));
        assertThat(marksQueue.dequeue(), is(2));
    }

    @Test
    public void ShouldReturnAppropriateSizesOfStacks() throws Exception {
        marksQueue.enqueue(0);
        marksQueue.enqueue(1);
        marksQueue.enqueue(2);

        assertThat(marksQueue.getInStackSize(), is(3));
        assertThat(marksQueue.getOutStackSize(), is(0));
    }

    @Test
    public void ShouldFlushInStackElementsWhenDequeueIsCalledOnAnEmptyOutstack() throws Exception {
        marksQueue.enqueue(0);
        marksQueue.enqueue(1);
        marksQueue.enqueue(2);

        marksQueue.dequeue();

        assertThat(marksQueue.getInStackSize(), is(0));
        assertThat(marksQueue.getOutStackSize(), is(2));
    }

    @Test
    public void ShouldThrowExceptionIfNoElementInTheQueue() throws Exception {
        exception.expect(NoElementInTheQueueException.class);

        marksQueue.dequeue();
    }
}

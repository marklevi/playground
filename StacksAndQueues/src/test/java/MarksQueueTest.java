import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MarksQueueTest {

    @Test
    public void ShouldDequeueTheFirstNumberThatWasEnqueued() throws Exception {
        final MarksQueue marksQueue = new MarksQueue(new InStack(), new OutStack());

        marksQueue.enqueue(0);
        marksQueue.enqueue(1);
        marksQueue.enqueue(2);

        assertThat(marksQueue.dequeue(), is(0));
        assertThat(marksQueue.dequeue(), is(1));
        assertThat(marksQueue.dequeue(), is(2));
    }

    @Test
    public void ShouldReturnAppropriateSizesOfStacks() throws Exception {
        final MarksQueue marksQueue = new MarksQueue(new InStack(), new OutStack());

        marksQueue.enqueue(0);
        marksQueue.enqueue(1);
        marksQueue.enqueue(2);

        assertThat(marksQueue.getInStackSize(), is(3));
        assertThat(marksQueue.getOutStackSize(), is(0));
    }

    @Test
    public void ShouldFlushInStackElementsWhenDequeueIsCalledOnAnEmptyOutstack() throws Exception {
        final MarksQueue marksQueue = new MarksQueue(new InStack(), new OutStack());

        marksQueue.enqueue(0);
        marksQueue.enqueue(1);
        marksQueue.enqueue(2);

        marksQueue.dequeue();

        assertThat(marksQueue.getInStackSize(), is(0));
        assertThat(marksQueue.getOutStackSize(), is(2));
    }

    
}

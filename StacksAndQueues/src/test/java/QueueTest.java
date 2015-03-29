import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueueTest {

    @Test
    public void ShouldDequeueTheFirstNumberThatWasEnqueued() throws Exception {
        final MarksQueue marksQueue = new MarksQueue(new InStack(), new OutStack());

        marksQueue.enqueue(0);
        marksQueue.enqueue(1);
        marksQueue.enqueue(2);

        assertThat(marksQueue.dequeue(), is(0));
        assertThat(marksQueue.dequeue(), is(1));

    }
}

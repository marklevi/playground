import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MeetingTimesMergerTest {
    @Test
    public void MergeTwoArrays() throws Exception {
        final Tuple tuple = new Tuple(3, 5);
        final Tuple tuple1 = new Tuple(4, 8);
        final List<Tuple> tuples = Arrays.asList(tuple, tuple1);

        final MeetingTimesMerger meetingTimesMerger = new MeetingTimesMerger();
        final List<Tuple> condensedMeetings = meetingTimesMerger.mergeRanges(tuples);

        assertThat(condensedMeetings, is(Arrays.asList(new Tuple(3, 8))));
    }
}
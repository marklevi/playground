import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MeetingTimesMerger {
    public List<Tuple> mergeRanges(List<Tuple> tuples) {
        Collections.sort(tuples);

        int count = 0;

        List<Tuple> mergedMeetings = new ArrayList<>();

        for (Tuple tuple : tuples) {
            if (tuples.size() == count + 1) {
                break;
            }
            if (tuple.getY() > tuples.get(count + 1).getX()) {
                mergedMeetings.add(new Tuple(tuple.getX(), tuples.get(count + 1).getY()));
            }
            count++;
        }
        return mergedMeetings;
    }
}

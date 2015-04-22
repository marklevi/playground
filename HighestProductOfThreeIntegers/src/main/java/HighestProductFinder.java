import java.util.List;

public class HighestProductFinder {
    public Integer findHighestProductOfThree(List<Integer> numbers) {
        int highestProductOfThree = numbers.get(0) * numbers.get(1) * numbers.get(2);

        int highest = Math.max(numbers.get(0), numbers.get(1));
        int lowest = Math.min(numbers.get(0), numbers.get(1));

        int highestProductOfTwo = numbers.get(0) * numbers.get(1);
        int lowestProductOfTwo = numbers.get(0) * numbers.get(1);

        for (Integer current : numbers.subList(2, numbers.size())) {

            highestProductOfThree = Math.max(highestProductOfThree, Math.max(current * highestProductOfTwo, current * lowestProductOfTwo));

            highestProductOfTwo = Math.max(highestProductOfTwo, Math.max(current * highest, current * lowest));

            lowestProductOfTwo = Math.min(lowestProductOfTwo, Math.min(current * highest, current * lowest));

            highest = Math.max(highest, current);

            lowest = Math.min(lowest, current);
        }
        return highestProductOfThree;
    }
}

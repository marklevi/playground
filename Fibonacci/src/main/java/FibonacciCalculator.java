import java.util.HashMap;

public class FibonacciCalculator {

    private final HashMap<Integer, Integer> memo;

    public FibonacciCalculator() {
        this.memo = new HashMap<>();
    }

    public Integer computeFib(int nthNumber) {
        if(nthNumber == 0 || nthNumber == 1){
            return nthNumber;
        }

        if (memo.containsKey(nthNumber)) {
            final Integer storedValue = memo.get(nthNumber);
            System.out.println("grabbing nth number: " + nthNumber);
            return storedValue;
        }

        int result = computeFib(nthNumber - 1) + computeFib(nthNumber - 2);
        System.out.println("computing fib " + nthNumber );
        memo.put(nthNumber, result);

        return result;
    }
}

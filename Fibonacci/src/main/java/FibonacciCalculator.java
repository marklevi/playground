public class FibonacciCalculator {
    public Integer compute(int number) {
        if(number == 0 || number == 1){
            return number;
        }
        return compute(number - 1) + compute(number - 2);
    }
}

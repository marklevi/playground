import java.util.ArrayList;

public class StackImpl implements StackInterface {

    private ArrayList<Integer> stack = new ArrayList<Integer>();

    @Override
    public void push(Integer number) {
        stack.add(number);
    }

    @Override
    public Integer pop() {
        return stack.remove(stack.size() - 1);
    }

    public Integer getSize() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

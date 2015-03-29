import java.util.Stack;

public class InStack implements StackInterface {

    private Stack stack = new Stack();

    @Override
    public void push(Integer number) {
        stack.push(number);
    }

    @Override
    public Integer pop() {
        return (Integer) stack.pop();
    }

    public Integer getSize() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

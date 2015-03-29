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
}

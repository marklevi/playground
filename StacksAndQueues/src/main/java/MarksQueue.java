import exceptions.NoElementInTheQueueException;

import java.util.EmptyStackException;

public class MarksQueue implements Queue {

    private StackInterface inStack = new StackImpl();
    private StackInterface outStack = new StackImpl();

    @Override
    public void enqueue(Integer number) {
        inStack.push(number);
    }

    @Override
    public int dequeue() {
        try {
            if (outStack.isEmpty()) {
                popAllElementsInInStack();
            }
            return outStack.pop();
        } catch (EmptyStackException e) {
            throw new NoElementInTheQueueException();
        }
    }

    private void popAllElementsInInStack() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }

    public Integer getInStackSize() {
        return inStack.getSize();
    }

    public Integer getOutStackSize() {
        return outStack.getSize();
    }
}

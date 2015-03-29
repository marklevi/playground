import exceptions.NoElementInTheQueueException;

public class MarksQueue implements Queue {

    private StackImpl inStack = new StackImpl();
    private StackImpl outStack = new StackImpl();

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
        } catch (IndexOutOfBoundsException e) {
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

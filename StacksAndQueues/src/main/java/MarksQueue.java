public class MarksQueue implements Queue {

    private final InStack inStack;
    private final OutStack outStack;

    public MarksQueue(InStack inStack, OutStack outStack) {
        this.inStack = inStack;
        this.outStack = outStack;
    }

    @Override
    public void enqueue(Integer number) {
        inStack.push(number);
    }

    @Override
    public int dequeue() {
        if(outStack.isEmpty()){
            popAllElementsInInStack();
        }
        return outStack.pop();
    }

    private void popAllElementsInInStack() {
        while(!inStack.isEmpty()){
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

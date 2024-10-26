package stack;

public class Stack {
    private String[] stack = {};


    public void push(String x) {
        int length = this.stack.length;
        String[] newStack = new String[length + 1];

        System.arraycopy(this.stack, 0, newStack, 0, length);

        newStack[length] = x;

        this.stack = newStack;
    }

    public void pop() throws Exception {
        int length = this.stack.length;
        if (length > 0) {
            String[] newStack = new String[length - 1];

            System.arraycopy(this.stack, 0, newStack, 0, length - 1);
            this.stack = newStack;
        } else {
            throw new Exception("Stack is empty");
        }
    }


    public String peek() throws Exception{
        int length = this.stack.length;
        if(length >= 1){
            return this.stack[length - 1];
        }
        else{
            throw new Exception("Stack is empty");
        }
    }

    public String[] getStack() {
        return this.stack;
    }

    public void setStack(String[] stack) {
        this.stack = stack;
    }
}
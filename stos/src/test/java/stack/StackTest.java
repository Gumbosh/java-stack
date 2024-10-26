package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    private Stack stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack();
    }

    @Test
    public void testPush() {
        stack.push("item1");
        assertArrayEquals(new String[]{"item1"}, stack.getStack());

        stack.push("item2");
        assertArrayEquals(new String[]{"item1", "item2"}, stack.getStack());
    }

    @Test
    public void testPop() throws Exception {
        stack.push("item1");
        stack.push("item2");
        stack.pop();
        assertArrayEquals(new String[]{"item1"}, stack.getStack());

        stack.pop();
        assertArrayEquals(new String[]{}, stack.getStack());
    }

    @Test
    public void testPopEmptyStack() {
        Exception exception = assertThrows(Exception.class, () -> {
            stack.pop();
        });
        assertNotNull(exception);
    }

    @Test
    public void testPeek() throws Exception {
        stack.push("item1");
        assertEquals("item1", stack.peek());

        stack.push("item2");
        assertEquals("item2", stack.peek());
    }

    @Test
    public void testPeekEmptyStack() {
        Exception exception = assertThrows(Exception.class, () -> {
            stack.peek();
        });
        assertNotNull(exception);
    }

    @Test
    public void testGetStack() {
        assertArrayEquals(new String[]{}, stack.getStack());
        stack.push("item1");
        assertArrayEquals(new String[]{"item1"}, stack.getStack());
    }

    @Test
    public void testSetStack() {
        String[] newStack = {"item1", "item2"};
        stack.setStack(newStack);
        assertArrayEquals(newStack, stack.getStack());
    }
}

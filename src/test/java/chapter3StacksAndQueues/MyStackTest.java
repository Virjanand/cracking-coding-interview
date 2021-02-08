package chapter3StacksAndQueues;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyStackTest {

    @Test
    void retrievePushedItem() {

        MyStack<String> myStack = new MyStack<>();
        myStack.push("a");
        assertThat(myStack.pop()).isEqualTo("a");
    }

    @Test
    void retrieveItemsLIFO() {

        MyStack<String> myStack = new MyStack<>();
        myStack.push("a");
        myStack.push("b");
        assertThat(myStack.pop()).isEqualTo("b");
        assertThat(myStack.pop()).isEqualTo("a");
    }

    @Test
    void popOnEmptyStack() {

        MyStack<String> myStack = new MyStack<>();
        assertThat(myStack.pop()).isNull();
    }

    @Test
    void storeAnyType() {

        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        assertThat(myStack.pop()).isEqualTo(1);
    }
}

package chapter3StacksAndQueues;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyQueueTest {

    @Test
    void addAndRemoveItem() {

        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.add("a");
        assertThat(myQueue.remove()).isEqualTo("a");
    }

    @Test
    void returnItemsFIFO() {

        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.add("a");
        myQueue.add("b");
        assertThat(myQueue.remove()).isEqualTo("a");
        assertThat(myQueue.remove()).isEqualTo("b");
    }

    @Test
    void removeOnEmptyQueue() {

        MyQueue<String> myQueue = new MyQueue<>();
        assertThat(myQueue.remove()).isNull();
    }

    @Test
    void storeAnyType() {

        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.add(1);
        assertThat(myQueue.remove()).isEqualTo(1);
    }
}

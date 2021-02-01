package chapter2LinkedLists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyLinkedListSizeTest {

    @Test
    void retrievesElementPutIn() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        assertThat(myLinkedList.size()).isEqualTo(0);
    }

    @Test
    void storesMultipleElements() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("test");
        myLinkedList.add("test2");

        assertThat(myLinkedList.size()).isEqualTo(2);
    }
}

package chapter2LinkedLists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyLinkedListTest {

    @Test
    void retrievesElementPutIn() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("test");

        assertThat(myLinkedList.get(0)).isEqualTo("test");
    }

    @Test
    void canStoreMultipleElements() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("test");
        myLinkedList.add("test2");

        assertThat(myLinkedList.get(0)).isEqualTo("test");
        assertThat(myLinkedList.get(1)).isEqualTo("test2");
    }

    @Test
    void canStoreElementOfAnyType() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1);

        assertThat(myLinkedList.get(0)).isEqualTo(1);
    }
}

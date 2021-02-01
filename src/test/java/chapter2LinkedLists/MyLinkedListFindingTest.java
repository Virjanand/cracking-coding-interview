package chapter2LinkedLists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyLinkedListFindingTest {

    @Test
    void findsIfElementExists() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("test");
        myLinkedList.add("test2");
        myLinkedList.add("test3");

        assertThat(myLinkedList.contains("test2")).isTrue();
    }

    @Test
    void findsIfElementDoesNotExists() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("test");

        assertThat(myLinkedList.contains("test2")).isFalse();
    }
}

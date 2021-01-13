package chapter2LinkedLists;

import org.junit.jupiter.api.Test;
import sun.awt.HKSCS;

import static org.assertj.core.api.Assertions.assertThat;

public class MyLinkedListTest {

    @Test
    void retrievesElementPutIn() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("test");

        assertThat(myLinkedList.get(0)).isEqualTo("test");
    }

    @Test
    void storesMultipleElements() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("test");
        myLinkedList.add("test2");

        assertThat(myLinkedList.get(0)).isEqualTo("test");
        assertThat(myLinkedList.get(1)).isEqualTo("test2");
    }

    @Test
    void storesElementOfGivenType() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1);

        assertThat(myLinkedList.get(0)).isEqualTo(1);
    }

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

    @Test
    void deletesGivenElement() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("test");
        String toBeDeletedElement = "toBeDeleted";
        myLinkedList.add(toBeDeletedElement);

        myLinkedList.delete(toBeDeletedElement);

        assertThat(myLinkedList.contains(toBeDeletedElement)).isFalse();
    }

    @Test
    void deletesFirstElement() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        String toBeDeletedElement = "toBeDeleted";
        myLinkedList.add(toBeDeletedElement);
        myLinkedList.add("test");

        myLinkedList.delete(toBeDeletedElement);

        assertThat(myLinkedList.get(0)).isEqualTo("test");
    }
}

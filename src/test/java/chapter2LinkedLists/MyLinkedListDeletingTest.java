package chapter2LinkedLists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyLinkedListDeletingTest {

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

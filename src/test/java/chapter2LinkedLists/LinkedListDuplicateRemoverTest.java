package chapter2LinkedLists;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;

public class LinkedListDuplicateRemoverTest {

    @Test
    void removeDuplicatesInNTimeAndNSpace() {
        LinkedList<String> linkedList = new LinkedList<>(asList("a", "a"));
        LinkedListDuplicateRemover duplicateRemover = new LinkedListDuplicateRemover();

        duplicateRemover.removeDuplicates(linkedList);

        LinkedList<String> expectedLinkedList = new LinkedList<>(singletonList("a"));
        assertThat(linkedList).isEqualTo(expectedLinkedList);
    }

}

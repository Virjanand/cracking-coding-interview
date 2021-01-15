package chapter2LinkedLists;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.LinkedList;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;

public class LinkedListDuplicateRemoverTest {

    private static Stream<Arguments> inputAndExpectedLinkedLists() {
        return Stream.of(
                Arguments.of(new LinkedList<>(asList("a", "a")), new LinkedList<>(singletonList("a"))),
                Arguments.of(new LinkedList<>(asList("a", "b")), new LinkedList<>(asList("a", "b"))),
                Arguments.of(new LinkedList<>(asList("a", "b", "a")), new LinkedList<>(asList("a", "b")))
        );
    }

    @ParameterizedTest(name = "{0} -> {1}")
    @MethodSource("inputAndExpectedLinkedLists")
    void removeDuplicatesInNTimeAndNSpace(LinkedList<String> inputLinkedList, LinkedList<String> expectedLinkedList) {
        LinkedListDuplicateRemover duplicateRemover = new LinkedListDuplicateRemover(inputLinkedList);

        duplicateRemover.removeDuplicates();

        assertThat(inputLinkedList).isEqualTo(expectedLinkedList);
    }

}

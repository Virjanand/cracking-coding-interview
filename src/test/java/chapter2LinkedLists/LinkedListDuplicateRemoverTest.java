package chapter2LinkedLists;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;

public class LinkedListDuplicateRemoverTest {

    private static Stream<Arguments> inputAndExpectedLinkedLists() {
        return Stream.of(
                Arguments.of(createLinkedList(asList("a", "a")), createLinkedList(singletonList("a"))),
                Arguments.of(createLinkedList(asList("a", "b")), createLinkedList(asList("a", "b"))),
                Arguments.of(createLinkedList(asList("a", "b", "a")), createLinkedList(asList("a", "b"))),
                Arguments.of(createLinkedList(asList("a", "b", "b", "a", "c")), createLinkedList(asList("a", "b", "c")))
        );
    }

    private static MyLinkedList<String> createLinkedList(List<String> nodes) {
        MyLinkedList<String> result = new MyLinkedList<>();
        for (String node : nodes) {
            result.add(node);
        }
        return result;
    }

    @ParameterizedTest(name = "{0} -> {1}")
    @MethodSource("inputAndExpectedLinkedLists")
    void removeDuplicatesInNTimeAndNSpace(MyLinkedList<String> inputLinkedList, MyLinkedList<String> expectedLinkedList) {
        LinkedListDuplicateRemover duplicateRemover = new LinkedListDuplicateRemover(inputLinkedList);

        duplicateRemover.removeDuplicatesInNTimeNSpace();

        assertThat(inputLinkedList).isEqualTo(expectedLinkedList);
    }
}

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
                Arguments.of((asList("a", "a")), (singletonList("a"))),
                Arguments.of((asList("a", "b")), (asList("a", "b"))),
                Arguments.of((asList("a", "b", "a")), (asList("a", "b"))),
                Arguments.of((asList("a", "b", "b", "a", "c")), asList("a", "b", "c"))
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
    void removeDuplicatesInNTimeAndNSpace(List<String> inputLinkedList, List<String> expectedLinkedList) {
        MyLinkedList<String> linkedList = createLinkedList(inputLinkedList);
        LinkedListDuplicateRemover duplicateRemover = new LinkedListDuplicateRemover(linkedList);

        duplicateRemover.removeDuplicatesInNTimeNSpace();

        assertThat(linkedList).isEqualTo(createLinkedList(expectedLinkedList));
    }
}

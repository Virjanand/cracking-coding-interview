package chapter2LinkedLists;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static chapter2LinkedLists.LinkedListTestUtil.createLinkedList;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;

public class KthToLastElementFinderTest {

    private static Stream<Arguments> inputAndExpectedLinkedLists() {
        return Stream.of(
                Arguments.of((singletonList("a")), 0, "a"),
                Arguments.of((asList("a", "b", "c")), 0, "c"),
                Arguments.of((asList("a", "b", "c")), 1, "b"),
                Arguments.of((asList("a", "b", "c")), 2, "a")
        );
    }

    @ParameterizedTest(name = "{1} from the last in {0} should be \"{2}\"")
    @MethodSource("inputAndExpectedLinkedLists")
    void findKthToLastElement(List<String> inputList, int kFromLast, String expectedNode) {

        KthToLastElementFinder kthToLastFinder = new KthToLastElementFinder(createLinkedList(inputList));
        assertThat(kthToLastFinder.find(kFromLast)).isEqualTo(expectedNode);
    }
}

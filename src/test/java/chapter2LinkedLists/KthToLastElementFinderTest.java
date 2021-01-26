package chapter2LinkedLists;

import org.junit.jupiter.api.Test;

import static chapter2LinkedLists.LinkedListTestUtil.createLinkedList;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class KthToLastElementFinderTest {

    @Test
    void findKthToLastElement() {

        KthToLastElementFinder kthToLastFinder = new KthToLastElementFinder(createLinkedList(asList("a")));
        assertThat(kthToLastFinder.find(0)).isEqualTo("a");
    }
}

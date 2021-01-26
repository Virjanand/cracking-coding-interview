package chapter2LinkedLists;

import java.util.List;

public class LinkedListTestUtil {
    static MyLinkedList<String> createLinkedList(List<String> nodes) {
        MyLinkedList<String> result = new MyLinkedList<>();
        for (String node : nodes) {
            result.add(node);
        }
        return result;
    }
}

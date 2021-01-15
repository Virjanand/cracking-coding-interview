package chapter2LinkedLists;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkedListDuplicateRemover {
    private final LinkedList<String> linkedList;

    public LinkedListDuplicateRemover(LinkedList<String> linkedList) {
        this.linkedList = linkedList;
    }

    public void removeDuplicates() {
        if (linkedList.get(0).equals(linkedList.get(1))) {
            linkedList.remove(1);
        }
        if (linkedList.size() > 2 && linkedList.get(0).equals(linkedList.get(2))) {
            linkedList.remove(2);
        }
    }
}

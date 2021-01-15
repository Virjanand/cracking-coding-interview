package chapter2LinkedLists;

import java.util.LinkedList;

public class LinkedListDuplicateRemover {
    private LinkedList<String> linkedList;

    public LinkedListDuplicateRemover(LinkedList<String> linkedList) {

        this.linkedList = linkedList;
    }

    public void removeDuplicates() {
        if (linkedList.get(0).equals(linkedList.get(1))) {
            linkedList.remove(1);
        }
    }
}

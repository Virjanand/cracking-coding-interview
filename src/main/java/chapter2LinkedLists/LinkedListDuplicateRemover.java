package chapter2LinkedLists;

import java.util.HashSet;
import java.util.Set;

public class LinkedListDuplicateRemover {
    private final MyLinkedList<String> linkedList;

    public LinkedListDuplicateRemover(MyLinkedList<String> linkedList) {
        this.linkedList = linkedList;
    }

    public void removeDuplicatesInNTimeNSpace() {
        MyLinkedListNode<String> currentNode = linkedList.getFirstNode();
        Set<String> visitedElements = new HashSet<>();
        while (currentNode != null) {
            visitedElements.add(currentNode.getValue());
            MyLinkedListNode<String> nextNode = currentNode.getNextNode();
            if (nextNode == null) {
                return;
            }
            if (visitedElements.contains(nextNode.getValue())) {
                currentNode.setNextNode(nextNode.getNextNode());
            } else {
                visitedElements.add(nextNode.getValue());
                currentNode = nextNode;
            }
        }
    }
}

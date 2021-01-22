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
        Set<MyLinkedListNode<String>> visitedElements = new HashSet<>();
        visitedElements.add(currentNode);
        while (currentNode != null) {
            MyLinkedListNode<String> nextNode = currentNode.getNextNode();
            if (nextNode == null) {
                return;
            }
            if (visitedElements.contains(nextNode)) {
                currentNode.setNextNode(nextNode.getNextNode());
            } else {
                visitedElements.add(nextNode);
                currentNode = nextNode;
            }
        }
    }
}

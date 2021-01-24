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
        while (isNotEndNode(currentNode)) {
            MyLinkedListNode<String> nextNode = currentNode.getNextNode();
            if (visitedElements.contains(nextNode)) {
                currentNode.removeNextNode();
            } else {
                visitedElements.add(nextNode);
                currentNode = nextNode;
            }
        }
    }

    private boolean isNotEndNode(MyLinkedListNode<String> currentNode) {
        return currentNode != null && currentNode.getNextNode() != null;
    }

    public void removeDuplicatesInNSquaredTimeO1Space() {
        MyLinkedListNode<String> currentNode = linkedList.getFirstNode();

        while (isNotEndNode(currentNode)) {
            MyLinkedListNode<String> runningNode = currentNode;
            while (runningNode != null) {
                if (currentNode.equals(runningNode.getNextNode())) {
                    runningNode = runningNode.removeNextNode();
                }
                runningNode = runningNode.getNextNode();
            }
            currentNode = currentNode.getNextNode();
        }
    }

}

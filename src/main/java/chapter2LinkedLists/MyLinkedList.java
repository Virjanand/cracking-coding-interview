package chapter2LinkedLists;

import java.util.Objects;

public class MyLinkedList<E> {

    private MyLinkedListNode<E> firstNode;

    public MyLinkedListNode<E> getFirstNode() {
        return firstNode;
    }

    public void add(E element) {
        if (isFirstNodeNotYetSet()) {
            setFirstNode(element);
        } else {
            addNodeAtTheEnd(element);
        }
    }

    private boolean isFirstNodeNotYetSet() {
        return firstNode == null;
    }

    private void setFirstNode(E element) {
        firstNode = new MyLinkedListNode<>(element);
    }

    private void addNodeAtTheEnd(E element) {
        MyLinkedListNode<E> currentNode = firstNode;
        while (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(new MyLinkedListNode<>(element));
    }

    public E get(int index) {
        MyLinkedListNode<E> currentNode = firstNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode.getValue();
    }

    public boolean contains(E element) {
        MyLinkedListNode<E> currentNode = firstNode;
        do {
            if (currentNode.getValue().equals(element)) {
                return true;
            }
            currentNode = currentNode.getNextNode();
        } while (currentNode != null);
        return false;
    }

    public void delete(E element) {
        MyLinkedListNode<E> currentNode = firstNode;
        MyLinkedListNode<E> previousNode = null;
        do {
            if (currentNode.getValue().equals(element)) {
                if (previousNode != null) {
                    previousNode.setNextNode(currentNode.getNextNode());
                } else {
                    firstNode = currentNode.getNextNode();
                }
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        } while (currentNode != null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyLinkedList<?> that = (MyLinkedList<?>) o;
        MyLinkedListNode<?> thatNode = that.getFirstNode();
        MyLinkedListNode<E> thisNode = this.getFirstNode();
        while (thatNode != null && thisNode != null) {
            if (!thatNode.equals(thisNode)) {
                return false;
            }
            thatNode = thatNode.getNextNode();
            thisNode = thisNode.getNextNode();
        }
        return thisNode == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNode);
    }
}

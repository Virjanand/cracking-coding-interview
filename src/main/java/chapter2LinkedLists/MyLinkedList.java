package chapter2LinkedLists;

public class MyLinkedList<E> {

    private Node<E> firstNode;

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
        firstNode = new Node<>(element);
    }

    private void addNodeAtTheEnd(E element) {
        Node<E> currentNode = firstNode;
        while (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(new Node<>(element));
    }

    public E get(int index) {
        Node<E> currentNode = firstNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode.getValue();
    }

    public boolean contains(E element) {
        Node<E> currentNode = firstNode;
        do {
            if (currentNode.getValue().equals(element)) {
                return true;
            }
            currentNode = currentNode.getNextNode();
        } while (currentNode != null);
        return false;
    }

    public void delete(E element) {
        Node<E> currentNode = firstNode;
        Node<E> previousNode = null;
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

    private static class Node<E> {
        private final E value;
        private Node<E> nextNode;

        public Node(E value) {
            this.value = value;
        }

        public E getValue() {
            return value;
        }

        public Node<E> getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node<E> node) {
            nextNode = node;
        }
    }
}

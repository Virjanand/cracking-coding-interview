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

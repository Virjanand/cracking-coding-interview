package chapter2LinkedLists;

class MyLinkedListNode<E> {
    private final E value;
    private MyLinkedListNode<E> nextNode;

    public MyLinkedListNode(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public MyLinkedListNode<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(MyLinkedListNode<E> node) {
        nextNode = node;
    }
}

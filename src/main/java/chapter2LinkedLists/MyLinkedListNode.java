package chapter2LinkedLists;

import java.util.Objects;

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

    MyLinkedListNode<E> removeNextNode() {
        MyLinkedListNode<E> nextNode = this.getNextNode();
        if (nextNode != null) {
            this.setNextNode(nextNode.getNextNode());
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyLinkedListNode<?> that = (MyLinkedListNode<?>) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

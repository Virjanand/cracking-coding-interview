package chapter3StacksAndQueues;

public class MyQueue<E> {

    MyQueueNode<E> first;
    MyQueueNode<E> last;

    private static class MyQueueNode<E> {

        private MyQueueNode<E> next;
        private final E value;

        public MyQueueNode(E value) {
            this.value = value;
        }

        public void setNext(MyQueueNode<E> next) {
            this.next = next;
        }

    }

    public void add(E value) {
        if (first == null) {
            first = new MyQueueNode<>(value);
            last = first;
        } else {
            MyQueueNode<E> newNode = new MyQueueNode<>(value);
            last.setNext(newNode);
            last = newNode;
        }
    }

    public E remove() {
        if (first == null) {
            return null;
        }
        E value = first.value;
        first = first.next;
        return value;
    }
}

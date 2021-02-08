package chapter3StacksAndQueues;

public class MyStack<E> {

    private static class MyStackNode<E>{

        private MyStackNode<E> next;
        private final E value;
        public MyStackNode(E value) {
            this.value = value;
        }

        public void setNext(MyStackNode<E> next) {
            this.next = next;
        }

    }
    private MyStackNode<E> top;

    public void push(E value) {
        MyStackNode<E> newTopNode = new MyStackNode<>(value);
        newTopNode.setNext(top);
        top = newTopNode;
    }

    public E pop() {
        if (top == null) {
            return null;
        }
        MyStackNode<E> previousTop = top;
        top = top.next;
        return previousTop.value;
    }
}

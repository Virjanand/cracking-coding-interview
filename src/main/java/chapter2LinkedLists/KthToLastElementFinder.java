package chapter2LinkedLists;

public class KthToLastElementFinder {
    private MyLinkedList<String> linkedList;

    public KthToLastElementFinder(MyLinkedList<String> linkedList) {

        this.linkedList = linkedList;
    }

    public String find(int kFromLast) {
        int lastElementIndex = linkedList.size() - 1;
        return linkedList.get(lastElementIndex - kFromLast);
    }
}

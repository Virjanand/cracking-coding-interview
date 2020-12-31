package arraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyArrayListTest {

    @Test
    void retrievesElementPutIn() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);

        assertThat(myArrayList.get(0)).isEqualTo(1);
    }

    @Test
    void elementCanBeAnyType() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("test");

        assertThat(myArrayList.get(0)).isEqualTo("test");
    }

    @Test
    void canStoreMultipleItems() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);

        assertThat(myArrayList.get(0)).isEqualTo(1);
        assertThat(myArrayList.get(1)).isEqualTo(2);
    }

    @Test
    void givesSize() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);

        assertThat(myArrayList.size()).isEqualTo(2);
    }

    @Test
    void resizesWhenNeeded() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(1);
        myArrayList.add(1);

        assertThat(myArrayList.size()).isEqualTo(3);
    }
}

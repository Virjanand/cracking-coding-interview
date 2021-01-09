package chapter1ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class MyHashTableTest {

    @Test
    void getValueWithKey() {
        MyHashTable<Integer, String> myHashTable = new MyHashTable<>();
        String value = "test";
        Integer key = 1;
        myHashTable.put(key, value);

        assertThat(myHashTable.get(key)).isEqualTo(value);
    }

    @Test
    void valueNotFoundThrowsIllegalArgumentException() {
        MyHashTable<Integer, String> myHashTable = new MyHashTable<>();

        assertThatThrownBy(() -> myHashTable.get(1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("No key found matching 1");
    }

    @Test
    void storeMultipleKeyValuePairs() {
        MyHashTable<Integer, String> myHashTable = new MyHashTable<>();
        Integer key1 = 1;
        String value1 = "test";
        myHashTable.put(key1, value1);
        Integer key2 = 2;
        String value2 = "test2";
        myHashTable.put(key2, value2);

        assertThat(myHashTable.get(key1)).isEqualTo(value1);
        assertThat(myHashTable.get(key2)).isEqualTo(value2);
    }
}

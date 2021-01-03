package arraysAndStrings;

public class MyHashTable<K, V> {

    public static final int ARRAY_LENGTH = 2;
    private Entry<K, V>[] entries = new Entry[ARRAY_LENGTH];

    public V get(K key) {
        Entry entry = entries[key.hashCode() % ARRAY_LENGTH];
        while (entry != null && !entry.getKey().equals(key)) {
            entry = entry.getNext();
        }
        if (entry == null) {
            throw new IllegalArgumentException("No key found matching " + key);
        }
        return (V) entry.getValue();
    }

    public void put(K key, V value) {
        if (entries[key.hashCode() % ARRAY_LENGTH] != null) {
            entries[key.hashCode() % ARRAY_LENGTH].setNext(new Entry(key, value));
        } else {
            entries[key.hashCode() % ARRAY_LENGTH] = new Entry<>(key, value);
        }
    }
}

class Entry<K, V> {
    private K key;
    private V value;
    private Entry next;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setNext(Entry next) {
        this.next = next;
    }

    public Entry getNext() {
        return next;
    }
}

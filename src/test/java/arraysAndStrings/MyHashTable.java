package arraysAndStrings;

public class MyHashTable<K, V> {

    public static final int ARRAY_LENGTH = 2;
    @SuppressWarnings("unchecked")
    private final Entry<K, V>[] entries = new Entry[ARRAY_LENGTH];

    public V get(K key) {
        Entry<K, V> entry = entries[key.hashCode() % ARRAY_LENGTH];
        while (entry != null && !entry.getKey().equals(key)) {
            entry = entry.getNext();
        }
        if (entry == null) {
            throw new IllegalArgumentException("No key found matching " + key);
        }
        return entry.getValue();
    }

    public void put(K key, V value) {
        if (entries[key.hashCode() % ARRAY_LENGTH] != null) {
            entries[key.hashCode() % ARRAY_LENGTH].setNext(new Entry<>(key, value));
        } else {
            entries[key.hashCode() % ARRAY_LENGTH] = new Entry<>(key, value);
        }
    }

    private static class Entry<K, V> {
        private final K key;
        private final V value;
        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        private K getKey() {
            return key;
        }

        private V getValue() {
            return value;
        }

        private void setNext(Entry<K, V> next) {
            this.next = next;
        }

        private Entry<K, V> getNext() {
            return next;
        }
    }

}

package arraysAndStrings;

public class MyArrayList<T> {

    private T[] values;
    private int size;

    public MyArrayList() {
        values = (T[]) new Object[2];
    }

    public T get(int index) {
        return values[index];
    }

    public void add(T value) {
        if (isValuesArrayAtMaxCapacity()) {
            resizeValuesArray();
        }
        addValueToValuesArray(value);
    }

    private void addValueToValuesArray(T value) {
        values[size++] = value;
    }

    private boolean isValuesArrayAtMaxCapacity() {
        return values.length == size;
    }

    private void resizeValuesArray() {
        T[] temp = (T[]) new Object[size * 2];
        System.arraycopy(values, 0, temp, 0, values.length);
        values = temp;
    }

    public int size() {
        return size;
    }
}

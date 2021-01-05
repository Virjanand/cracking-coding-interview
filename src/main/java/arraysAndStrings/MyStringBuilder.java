package arraysAndStrings;

public class MyStringBuilder {
    private char[] letters;
    private int length;

    public MyStringBuilder(String value) {
        letters = value.toCharArray();
        length = value.length();
    }

    @Override
    public String toString() {
        return new String(letters).trim();
    }

    public MyStringBuilder append(String value) {
        if (isLettersAtMaxCapacity(value)) {
            expandLettersArray(value);
        }
        addStringToLettersArray(value);

        return this;
    }

    private void addStringToLettersArray(String value) {
        System.arraycopy(value.toCharArray(), 0, letters, length, value.length());
        length += value.length();
    }

    private void expandLettersArray(String value) {
        int newLength = 2 * (length + value.length());
        char[] temp = new char[newLength];
        System.arraycopy(letters, 0, temp, 0, length);
        letters = temp;
    }

    private boolean isLettersAtMaxCapacity(String value) {
        return letters.length < length + value.length();
    }
}

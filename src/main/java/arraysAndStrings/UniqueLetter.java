package arraysAndStrings;

import java.util.Arrays;
import java.util.stream.IntStream;

public class UniqueLetter {
    private String letters;

    public UniqueLetter(String letters) {
        this.letters = letters;
    }

    public boolean testWithLinearRuntime() {
        char[] letters = this.letters.toCharArray();
        Arrays.sort(letters);
        return IntStream.range(0, letters.length - 1)
                .noneMatch(i -> letters[i] == letters[i + 1]);
    }
}

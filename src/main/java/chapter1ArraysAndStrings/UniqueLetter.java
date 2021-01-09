package chapter1ArraysAndStrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class UniqueLetter {
    private String letters;

    public UniqueLetter(String letters) {
        this.letters = letters;
    }

    public boolean testWithnlognRuntime() {
        char[] letters = this.letters.toCharArray();
        Arrays.sort(letters);
        return IntStream.range(0, letters.length - 1)
                .noneMatch(i -> letters[i] == letters[i + 1]);
    }

    public boolean testWithLinearRuntime() {
        Set<Character> checkedLetters = new HashSet<>();
        char[] letters = this.letters.toCharArray();
        for (char letter : letters) {
            if (checkedLetters.contains(letter)) {
                return false;
            }
            checkedLetters.add(letter);
        }
        return true;
    }
}

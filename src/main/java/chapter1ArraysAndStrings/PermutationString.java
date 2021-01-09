package chapter1ArraysAndStrings;

import java.util.Map;
import java.util.stream.IntStream;

import static java.util.Arrays.sort;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class PermutationString {

    private String reference;

    public PermutationString(String reference) {

        this.reference = reference;
    }

    public boolean isPermutationOfInNLogNTime(String compareTo) {
        if (reference.length() != compareTo.length()) {
            return false;
        }

        char[] referenceLetters = reference.toCharArray();
        char[] compareToLetters = compareTo.toCharArray();

        sort(referenceLetters);
        sort(compareToLetters);

        return IntStream.range(0, referenceLetters.length)
                .noneMatch(i -> referenceLetters[i] != compareToLetters[i]);
    }

    public boolean isPermutationOfInNTime(String compareTo) {
        if (reference.length() != compareTo.length()) {
            return false;
        }

        char[] compareToLetters = compareTo.toCharArray();

        Map<Character, Long> characterCount = countLetters();

        for (char compareToLetter : compareToLetters) {
            if (characterCount.containsKey(compareToLetter)) {
                reduceCountOfLetterInCharacterCount(characterCount, compareToLetter);
            } else {
                return false;
            }
        }

        return true;
    }

    private Map<Character, Long> countLetters() {
        return reference.chars()
                .mapToObj(PermutationString::convertToChar)
                .collect(groupingBy(Character::charValue, counting()));
    }

    private static Character convertToChar(int i) {
        return (char) i;
    }

    private void reduceCountOfLetterInCharacterCount(Map<Character, Long> characterCount, char compareToLetter) {
        if (characterCount.get(compareToLetter) == 1) {
            characterCount.remove(compareToLetter);

        } else {
            characterCount.put(compareToLetter, characterCount.get(compareToLetter) - 1);
        }
    }
}

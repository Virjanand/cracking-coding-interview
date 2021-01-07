package arraysAndStrings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class PermutationStringTest {

    @ParameterizedTest(name="Is \"{0}\" a permutation of \"{1}\"? -> {2}")
    @CsvSource({
            "a, a, true",
            "a, b, false",
            "ab, ba, true",
            "ab, abc, false",
            "abcd, adcb, true",
            "aabcd, adacb, true",
    })
    void isPermutationInNLogNTime(String reference, String compareTo, boolean result) {
        PermutationString permutationString = new PermutationString(reference);
        assertThat(permutationString.isPermutationOfInNLogNTime(compareTo)).isEqualTo(result);
    }

    @ParameterizedTest(name="Is \"{0}\" a permutation of \"{1}\"? -> {2}")
    @CsvSource({
            "a, a, true",
            "a, b, false",
            "ab, ba, true",
            "ab, abc, false",
            "abcd, adcb, true",
            "aabcd, adacb, true",
    })
    void isPermutationInNTime(String reference, String compareTo, boolean result) {
        PermutationString permutationString = new PermutationString(reference);
        assertThat(permutationString.isPermutationOfInNTime(compareTo)).isEqualTo(result);
    }
}

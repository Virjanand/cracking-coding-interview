package arraysAndStrings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class UniqueLetterTest {

    @ParameterizedTest(name = "Does \"{0}\" have only unique letters -> {1}")
    @CsvSource({
            "a, true",
            "aa, false",
            "abcbd, false"
    })
    void testWithLinearRuntime(String letters, boolean isOnlyUniqueLetters) {
        UniqueLetter uniqueLetter = new UniqueLetter(letters);
        assertThat(uniqueLetter.testWithLinearRuntime()).isEqualTo(isOnlyUniqueLetters);
    }
}

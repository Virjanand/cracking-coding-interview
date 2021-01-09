package chapter1ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyStringBuilderTest {

    @Test
    void toStringReturnsString() {
        MyStringBuilder myStringBuilder = new MyStringBuilder("test");

        assertThat(myStringBuilder.toString()).isEqualTo("test");
    }

    @Test
    void canAppendOtherString() {
        MyStringBuilder myStringBuilder = new MyStringBuilder("test");

        myStringBuilder.append("test2");

        assertThat(myStringBuilder.toString()).isEqualTo("testtest2");
    }

    @Test
    void canChainAppendOtherString() {
        MyStringBuilder myStringBuilder = new MyStringBuilder("test");

        myStringBuilder.append("test2").append("test3");

        assertThat(myStringBuilder.toString()).isEqualTo("testtest2test3");
    }
}

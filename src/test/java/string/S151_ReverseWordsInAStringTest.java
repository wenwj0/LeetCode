package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S151_ReverseWordsInAStringTest {

    @Test
    void reverseWords() {
        S151_ReverseWordsInAString test = new S151_ReverseWordsInAString();
        assertEquals("world! hello",test.reverseWords("  hello world!  "));
        assertEquals("blue is sky the",test.reverseWords("the sky is blue"));
        assertEquals("example good a",test.reverseWords("a good   example"));
        assertEquals("example",test.reverseWords(" example"));
        assertEquals("example",test.reverseWords("example "));
    }
}
package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S557_ReverseWordsInAStringTest {

    @Test
    void reverseWords() {
        S557_ReverseWordsInAString test = new S557_ReverseWordsInAString();
        assertEquals("s'teL ekat edoCteeL tsetnoc",test.reverseWords("Let's take LeetCode contest"));
    }
}
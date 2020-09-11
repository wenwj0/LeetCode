package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S125_ValidPalindromeTest {

    @Test
    void isPalindrome() {
        S125_ValidPalindrome test = new S125_ValidPalindrome();

        assertTrue(test.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(!test.isPalindrome("race a car"));
        assertTrue(test.isPalindrome(".,"));
        assertTrue(!test.isPalindrome("0P"));
    }
}
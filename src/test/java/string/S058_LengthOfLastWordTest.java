package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S058_LengthOfLastWordTest {

    @Test
    void lengthOfLastWord() {
        S058_LengthOfLastWord test = new S058_LengthOfLastWord();

        assertEquals(test.lengthOfLastWord("Hello world"),5);
        assertEquals(test.lengthOfLastWord(" world"),5);
        assertEquals(test.lengthOfLastWord("Hello "),5);
        assertEquals(test.lengthOfLastWord("Hello"),5);
        assertEquals(test.lengthOfLastWord(" Hello "),5);
        assertEquals(test.lengthOfLastWord(" "),0);
        assertEquals(test.lengthOfLastWord("b   a    "),1);
        assertEquals(test.lengthOfLastWord(""),0);
    }
}
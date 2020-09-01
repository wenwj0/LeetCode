package bitManipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S338_CountingBitsTest {

    @Test
    void countBits() {
        S338_CountingBits test = new S338_CountingBits();
        assertArrayEquals(test.countBits(5),new int[]{0,1,1,2,1,2});
    }
}
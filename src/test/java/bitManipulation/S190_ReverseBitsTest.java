package bitManipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S190_ReverseBitsTest {

    @Test
    void reverseBits() {
        S190_ReverseBits s190_reverseBits = new S190_ReverseBits();
        int a = s190_reverseBits.reverseBits(43261596);
        int b = 964176192;
        assertEquals(a,b);
    }
}
package bitManipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S201_BitwiseANDofNumbersRangeTest {

    @Test
    void rangeBitwiseAndTest() {
        S201_BitwiseANDofNumbersRange s201_bitwiseANDofNumbersRange = new S201_BitwiseANDofNumbersRange();
        int m = 5;
        int n = 7;
        int res = 4;
        assertEquals(s201_bitwiseANDofNumbersRange.rangeBitwiseAnd(m,n),res);
    }
}
package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S153_FindMinimumInRotatedSortedArrayTest {

    @Test
    void findMin() {
        S153_FindMinimumInRotatedSortedArray test = new S153_FindMinimumInRotatedSortedArray();
        assertEquals(1,test.findMin(new int[]{3,4,5,1,2}));
        assertEquals(0,test.findMin(new int[]{4,5,6,7,0,1,2}));
        assertEquals(0,test.findMin(new int[]{4,5,6,7,0}));
        assertEquals(0,test.findMin(new int[]{4,5,6,7,0,1}));
        assertEquals(0,test.findMin(new int[]{3,4,5,6,7,0}));
        assertEquals(0,test.findMin(new int[]{7,0,1,2,3}));
        assertEquals(0,test.findMin(new int[]{6,7,0,1,2,3}));
        assertEquals(0,test.findMin(new int[]{7,0,1,2,3,4}));
    }
}
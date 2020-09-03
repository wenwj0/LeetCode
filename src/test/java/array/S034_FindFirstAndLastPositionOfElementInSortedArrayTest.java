package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S034_FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    void searchRange() {
        S034_FindFirstAndLastPositionOfElementInSortedArray test = new S034_FindFirstAndLastPositionOfElementInSortedArray();
        assertArrayEquals(new int[]{-1,-1},test.searchRange(new int[]{5,7,7,8,8,10},6));
        assertArrayEquals(new int[]{3,4},test.searchRange(new int[]{5,7,7,8,8,10},8));
        assertArrayEquals(new int[]{-1,-1},test.searchRange(new int[]{5,7,7,8,8,10},9));
        assertArrayEquals(new int[]{0,0},test.searchRange(new int[]{5,7,7,8,8,10},5));
        assertArrayEquals(new int[]{-1,-1},test.searchRange(new int[]{5,7,7,8,8,10},4));
        assertArrayEquals(new int[]{0,0},test.searchRange(new int[]{1},1));
        assertArrayEquals(new int[]{-1,-1},test.searchRange(new int[]{1},2));
        assertArrayEquals(new int[]{1,1},test.searchRange(new int[]{1,4},4));
    }
}
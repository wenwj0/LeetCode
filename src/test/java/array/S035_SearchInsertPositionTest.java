package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S035_SearchInsertPositionTest {

    @Test
    void searchInsert() {
        S035_SearchInsertPosition test = new S035_SearchInsertPosition();
        assertEquals(2,test.searchInsert(new int[]{1,3,5,6},5));
        assertEquals(1,test.searchInsert(new int[]{1,3,5,6},2));
        assertEquals(4,test.searchInsert(new int[]{1,3,5,6},7));
        assertEquals(0,test.searchInsert(new int[]{1,3,5,6},0));
        assertEquals(0,test.searchInsert(new int[]{1,3,5,6,9},0));
        assertEquals(5,test.searchInsert(new int[]{1,3,5,6,9},11));
        assertEquals(0,test.searchInsert(new int[]{1},1));
        assertEquals(1,test.searchInsert(new int[]{1},2));
        assertEquals(0,test.searchInsert(new int[]{1},0));
    }
}
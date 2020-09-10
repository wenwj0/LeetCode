package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S074_SearchA2DMatrixTest {

    @Test
    void searchMatrix() {
        S074_SearchA2DMatrix test = new S074_SearchA2DMatrix();
        assertTrue(test.searchMatrix(new int[][]{
                {1,   3,  5,  7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        },10));
        assertTrue(test.searchMatrix(new int[][]{
                {1,   3,  5,  7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        },3));
        assertTrue(!test.searchMatrix(new int[][]{
                {1,   3,  5,  7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        },13));
    }
}
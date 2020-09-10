package array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class S054_SpiralMatrixTest {

    @Test
    void spiralOrder() {
        List list0 = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        List list1 = Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7);
        List list2 = Arrays.asList(1, 2, 3);
        int[][] matrix0 = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] matrix1 = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int[][] matrix2 = new int[][]{
                {1,2,3}
        };
        S054_SpiralMatrix test = new S054_SpiralMatrix();
        assertEquals(list0,test.spiralOrder(matrix0));
        assertEquals(list1,test.spiralOrder(matrix1));
        assertEquals(list2,test.spiralOrder(matrix2));
    }
}
package Hard;

import org.junit.Assert;
import org.junit.Test;

public class MedianOfTwoSortedArraysTest {
    int[] arr1 = new int[] {1, 3, 6};

    // next, result 7,0
    int[] arr2 = new int[] {7, 8, 9, 9};

    // before, result 1,0
    int[] arr3 = new int[] {-2, -1};

    // before and within, result 2,5
    int[] arr4 = new int[] {0, 1, 2, 4, 5};

    // within and after, result 6,0
    int[] arr5 = new int[] {2, 4, 7, 10, 13, 15};

    // around, result 3,0
    int[] arr6 = new int[] {0, 2, 4, 7};

    @Test
    public void testFindMedianSortedArrays1_2() {
        Assert.assertEquals(7.0, MedianOfTwoSortedArrays.findMedianSortedArrays(arr1, arr2), 0.1);
    }

    @Test
    public void testFindMedianSortedArrays1_3() {
        Assert.assertEquals(1.0, MedianOfTwoSortedArrays.findMedianSortedArrays(arr1, arr3), 0.1);
    }

    @Test
    public void testFindMedianSortedArrays1_4() {
        Assert.assertEquals(2.5, MedianOfTwoSortedArrays.findMedianSortedArrays(arr1, arr4), 0.1);
    }

    @Test
    public void testFindMedianSortedArrays1_5() {
        Assert.assertEquals(6.0, MedianOfTwoSortedArrays.findMedianSortedArrays(arr1, arr5), 0.1);
    }

    @Test
    public void testFindMedianSortedArrays1_6() {
        Assert.assertEquals(3.0, MedianOfTwoSortedArrays.findMedianSortedArrays(arr1, arr6), 0.1);
    }
}
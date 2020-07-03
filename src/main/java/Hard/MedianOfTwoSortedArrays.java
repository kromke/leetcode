package Hard;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // всего элементов
        int lengths = nums1.length + nums2.length;
        // располагаем массивы по порядку
        int[] first = nums1[0] <= nums2[0] ? nums1 : nums2;
        int[] second = first == nums1 ? nums2 : nums1;

        // если массивы не пересекаются
        if (first[first.length - 1] < second[0]) {

            if (lengths % 2 == 0) {

                if (lengths / 2 < first.length) {
                    return (first[lengths / 2] + first[lengths / 2 - 1]) / 2d;
                } else {
                    return lengths / 2 == first.length ?
                            (second[0] + first[first.length - 1]) / 2d :
                            (second[lengths / 2 - first.length] + second[lengths / 2 - 1 - first.length]) / 2d;
                }
            } else {

                if (lengths / 2 < first.length) {
                    return first[lengths / 2];
                } else {
                    return second[lengths / 2 - first.length];
                }
            }
        }

        int indx1 = first.length / 2;
        int value1 = first[indx1];

        int indx2 = second[0] > value1 ? 0 : binarySearchLessOrEquals(second, value1);
        int value2 = second[indx2];


        while (value2 > value1) {
            indx1 = (indx1 + first.length) / 2;
            value1 = first[indx1];
            indx2 = second[0] > value1 ? 0 : binarySearchLessOrEquals(second, value1);
            value2 = second[indx2];
        }
        if (indx1 + indx2 == lengths / 2)
            return lengths % 2 == 0 ?
                    (value1 + value2) / 2d :
                    value1;

        if (indx1 + indx2 < lengths / 2) {

        }
return 0;
    }

    private static int binarySearchLessOrEquals(int[] arr, int key) {
        int indx = arr.length / 2;
        int s = 0;
        int f = arr.length;

        while (true) {
            if (arr[indx] == key)
                return indx;
            if (arr[indx] < key) {
                if (s == f)
                    return indx;
                s = indx;
                indx = (s + f) / 2;
                continue;
            }
            f = indx + 1;
            indx = (s + f) / 2;
        }
    }


    public static void main(String[] args) {

    }
}

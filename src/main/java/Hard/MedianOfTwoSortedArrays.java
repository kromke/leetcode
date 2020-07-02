package Hard;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int lengths = nums1.length + nums2.length;
        int[] first = nums1[0] < nums2[0] ? nums1 : nums2;
        int[] second = first == nums1 ? nums2 : nums1;

        if (first[first.length - 1] == second[0]) {

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
        return 0d;
    }

    public static void main(String[] args) {

    }
}

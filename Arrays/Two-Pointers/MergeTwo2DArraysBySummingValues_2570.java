public class MergeTwo2DArraysBySummingValues_2570 {

    public static void main(String[] args) {

        int[][] nums1 = {{1, 2}, {2, 3}, {4, 5}};
        int[][] nums2 = {{1, 4}, {3, 2}, {5, 1}};

        int[][] result = new int[nums1.length + nums2.length][2];

        int ptr1 = 0;
        int ptr2 = 0;
        int index = 0;

        while (ptr1 < nums1.length && ptr2 < nums2.length) {

            if (nums1[ptr1][0] < nums2[ptr2][0]) {

                result[index][0] = nums1[ptr1][0];
                result[index][1] = nums1[ptr1][1];

                ptr1++;

            } else if (nums1[ptr1][0] > nums2[ptr2][0]) {

                result[index][0] = nums2[ptr2][0];
                result[index][1] = nums2[ptr2][1];

                ptr2++;

            } else {


                result[index][0] = nums1[ptr1][0];
                result[index][1] = nums1[ptr1][1] + nums2[ptr2][1];

                ptr1++;
                ptr2++;
            }

            index++;
        }

        while (ptr1 < nums1.length) {

            result[index][0] = nums1[ptr1][0];
            result[index][1] = nums1[ptr1][1];

            ptr1++;
            index++;
        }

        while (ptr2 < nums2.length) {

            result[index][0] = nums2[ptr2][0];
            result[index][1] = nums2[ptr2][1];

            ptr2++;
            index++;
        }

        int[][] finalResult = new int[index][2];

        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }

        for (int i = 0; i < finalResult.length; i++) {
            System.out.println(
                "[" + finalResult[i][0] + ", " +
                      finalResult[i][1] + "]"
            );
        }
    }
}
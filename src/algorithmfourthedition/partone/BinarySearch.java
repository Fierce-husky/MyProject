package algorithmfourthedition.partone;

import java.util.Arrays;

/**
 * 二分查找
 */
public class BinarySearch {

    public static void main(String[] args) {
        int [] arr = {1,367,34,26,3476,7568,86,90,67,435,23,13,54};
        Arrays.sort(arr);
        System.out.println(find(132,arr));
    }
    public static int find(int key, int[] array) {
        int lowIndex = 0;
        int higthIndex = array.length - 1;
        while (lowIndex <= higthIndex) {
            int mid = (lowIndex + higthIndex) / 2;
            if (array[mid] > key) {
                higthIndex = mid - 1;
            } else if (array[mid] < key) {
                lowIndex = mid + 1;
            } else {
                return array[mid];
            }
        }
        return -1;
    }
}

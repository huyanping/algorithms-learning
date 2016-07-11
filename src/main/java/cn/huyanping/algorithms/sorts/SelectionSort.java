package cn.huyanping.algorithms.sorts;

/**
 * Created by Jenner on 2016/7/10.
 */
public class SelectionSort {

    public static void sort(int[] unsorted) {
        for (int i = 0; i < unsorted.length - 1; i++) {
            int key = i;
            int value = unsorted[i];
            for (int j = i + 1; j < unsorted.length; j++) {
                if (unsorted[j] < value) {
                    value = unsorted[j];
                    key = j;
                }
            }
            int temp = unsorted[i];
            unsorted[i] = unsorted[key];
            unsorted[key] = temp;

        }
    }
}

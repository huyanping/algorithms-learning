package cn.huyanping.algorithms.sorts;

/**
 * Created by Jenner on 2016/7/11.
 */
public class BubbleSort {
    // 思想：每次将最大的元素移动到最右边
    public static void sort(int[] unsorted) {
        for (int i = 0; i < unsorted.length - 1; i++) {
            for (int j = 0; j < unsorted.length - i - 1; j++) {
                if (unsorted[j] > unsorted[j + 1]) {
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = temp;
                }
            }
        }
    }
}

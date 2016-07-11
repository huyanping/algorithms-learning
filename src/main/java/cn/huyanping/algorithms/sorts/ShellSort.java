package cn.huyanping.algorithms.sorts;

/**
 * Created by Jenner on 2016/7/11.
 */
public class ShellSort {
    public static void sort(int[] unsorted) {

    }

    protected static void shellInsertSort(int[] unsorted, int start, int end) {
        for (int i = start; i < end; i++) {
            if (unsorted[i] > unsorted[i + 1]) {
                int temp = unsorted[i + 1];
                int j = i + 1;
                while (j > 0 && unsorted[j - 1] > temp) {
                    unsorted[j] = unsorted[j - 1];
                    j--;
                }
                unsorted[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] unsorted = {20, 7, 5, 6, 7, 1};
        shellInsertSort(unsorted, 0, 5);
        for (int i = 0; i < unsorted.length; i++) {
            System.out.println(unsorted[i]);
        }
    }
}

package cn.huyanping.algorithms.unit01;

/**
 * Created by Jenner on 2016/7/10.
 */
public class SelectionSort {

    public static void sort(int[] unsorted) {
        for (int i = 0; i < unsorted.length - 1; i++) {
            int key = i;
            for (int j = 1; j < unsorted.length; j++) {
                if (unsorted[j] < unsorted[i]) {
                    key = j;
                }
            }
            if (key != i) {
                int temp = unsorted[i];
                unsorted[i] = unsorted[key];
                unsorted[key] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] unsorted = {3, 2, 4, 5, 1, 6, 9};
        InsertionSort.sort(unsorted);
        for (int i = 0; i < unsorted.length; i++) {
            System.out.println(unsorted[i]);
        }
    }
}

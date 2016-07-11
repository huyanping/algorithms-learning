package cn.huyanping.algorithms.sorts;

/**
 * Created by Jenner on 2016/7/11.
 */
public class MergeSort {
    public static void sort(int[] unsorted) {
        run(unsorted, 0, unsorted.length - 1);
    }

    protected static void run(int[] unsorted, int low, int high) {
        int middle = (low + high) / 2;
        if (low < high) {
            run(unsorted, low, middle);
            run(unsorted, middle + 1, high);
            merge(unsorted, low, middle, high);
        }
    }

    protected static void merge(int[] unsorted, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (unsorted[i] < unsorted[j]) {
                temp[k++] = unsorted[i++];
            } else {
                temp[k++] = unsorted[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = unsorted[i++];
        }
        while (j <= high) {
            temp[k++] = unsorted[j++];
        }

        for (int h = 0; h < temp.length; h++) {
            unsorted[low + h] = temp[h];
        }
    }

    public static void main(String[] args) {
        int[] unsorted = {20, 10, 2, 4, 53, 2, 1};
        sort(unsorted);
        for(int i=0; i<unsorted.length; i++) {
            System.out.println(unsorted[i]);
        }
    }
}

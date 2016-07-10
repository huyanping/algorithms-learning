package cn.huyanping.algorithms.sorts;


/**
 * Created by Jenner on 2016/7/8.
 */
public class InsertionSort {
    public static void sort(int[] unsorted) {
        for(int i=1; i<unsorted.length; i++) {
            if(unsorted[i - 1] > unsorted[i]) {
                // 记录当前值
                int temp = unsorted[i];
                int j = i;
                // 找出左边第一个小于当前值的位置j，并将剩余元素向右移动
                while (j >0 && unsorted[j -1] > temp) {
                    unsorted[j] = unsorted[j-1];
                    j--;
                }
                //将当前值赋给j位置
                unsorted[j] = temp;
            }
        }
    }
}

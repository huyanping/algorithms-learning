package cn.huyanping.algorithms.sorts;


/**
 * Created by Jenner on 2016/7/8.
 */
public class InsertionSort {
    public static void sort(int[] unsorted) {
        for(int i=1; i<unsorted.length; i++) {
            if(unsorted[i - 1] > unsorted[i]) {
                // ��¼��ǰֵ
                int temp = unsorted[i];
                int j = i;
                // �ҳ���ߵ�һ��С�ڵ�ǰֵ��λ��j������ʣ��Ԫ�������ƶ�
                while (j >0 && unsorted[j -1] > temp) {
                    unsorted[j] = unsorted[j-1];
                    j--;
                }
                //����ǰֵ����jλ��
                unsorted[j] = temp;
            }
        }
    }
}

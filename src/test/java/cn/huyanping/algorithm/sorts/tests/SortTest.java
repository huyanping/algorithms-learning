package cn.huyanping.algorithm.sorts.tests;

import cn.huyanping.algorithms.sorts.InsertionSort;
import cn.huyanping.algorithms.sorts.MergeSort;
import cn.huyanping.algorithms.sorts.SelectionSort;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by lenovo on 2016/7/10.
 */
@RunWith(DataProviderRunner.class)
public class SortTest {
    protected static final int step = 20;
    protected static final int depth = 200;
    protected static Object[][] cache;

    protected static int[] createRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 10000);
        }

        return array;
    }

    protected static void sort(int[] unsorted) {
        InsertionSort.sort(unsorted);
    }

    @DataProvider
    public static Object[][] dataProvider() {
        if (cache != null) {
            return cache;
        }

        Object[][] result = new Object[depth][2];
        for (int i = 0; i < depth; i+=step) {
            int size = (i + 1) * (i+1);
            int[] unsorted = createRandomArray(size);
            int[] sorted = unsorted.clone();
            sort(sorted);
            result[i][0] = unsorted;
            result[i][1] = sorted;
        }
        cache = result;

        return result;
    }

    @Test
    @UseDataProvider("dataProvider")
    public void testInsertion(int[] unsorted, int[] sorted) {
        int[] clone = unsorted.clone();
        InsertionSort.sort(clone);
        Assert.assertArrayEquals(clone, sorted);
    }

    @Test
    @UseDataProvider("dataProvider")
    public void testSelection(int[] unsorted, int[] sorted) {
        int[] clone = unsorted.clone();
        SelectionSort.sort(clone);
        Assert.assertArrayEquals(clone, sorted);
    }

    @Test
    @UseDataProvider("dataProvider")
    public void testMerge(int[] unsorted, int[] sorted) {
        int[] clone = unsorted.clone();
        MergeSort.sort(clone);
        Assert.assertArrayEquals(clone, sorted);
    }
}

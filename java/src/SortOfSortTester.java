import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SortOfSortTester {
    @Test
    public void SortOfSort1() {//simple test to make sure the method passes
        int[] a = {2, 3, 5, 6, 7, 8};
        int[] exp = {6, 5, 2, 3, 7, 8};
        SortOfSort nums = new SortOfSort();
        nums.sortOfSort(a);
        assertArrayEquals(exp, a);

    }

    @Test
    public void SortOfSort2() {//tests negatives
        int[] a = {-6, -8, -1, -9, -5};
        int[] exp = {-6, -8, -9, -5, -1};
        SortOfSort nums = new SortOfSort();
        nums.sortOfSort(a);
        assertArrayEquals(exp, a);
    }

    @Test
    public void SortOfSort3() {//tests negatives and larger positive numbers together in ascending order
        int[] a = {-9,0,1, 2, 56, 99, 788};
        int[] exp = {56, 2, -9, 0, 1, 99, 788};
        SortOfSort nums = new SortOfSort();
        nums.sortOfSort(a);
        assertArrayEquals(exp, a);
    }

    @Test
    public void SortOfSort4() {//tests an empty array
        int[] a = {};
        int[] exp = {};
        SortOfSort nums = new SortOfSort();
        nums.sortOfSort(a);
        assertArrayEquals(exp, a);
    }
    @Test
    public void SortOfSort5() {// tests an array that's the same as the expected.. also tests duplicates
        int[] a = {2,1,3,3};
        int[] exp = {2,1,3,3};
        SortOfSort nums = new SortOfSort();
        nums.sortOfSort(a);
        assertArrayEquals(exp, a);
    }
}

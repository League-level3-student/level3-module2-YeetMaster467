package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String[] arr1 = {"a", "a", "a", "b", "a"};
        assertEquals(_01_LinearSearch.linearSearch(arr1, "b"), 3);
        String[] arr2 = {"apple", "pork ribs", "pear", "banana", "peach", "orange", "lemon"};
        assertEquals(_01_LinearSearch.linearSearch(arr2, "pork ribs"), 1);
        String[] arr3 = {"uqwb408yb2", "wbqoybyrbi", "qgyryiyrefaww", "uq0hygy4gqy3gt", "8qwyg97rgqt94vi2ou", "nqou4hyg4", "hoqwgefg2o3yg", "e8qg82gyo", "niq2uyhr082h", "ij9u2qhur3h38q", "inouqwoy8fg"};
        assertEquals(_01_LinearSearch.linearSearch(arr3, "e8qg82gyo"), 7);
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(_02_BinarySearch.binarySearch(arr1, 0, arr1.length, 7), 6);
        int[] arr2 = {2, 4, 5, 7, 8, 10, 12, 16, 20, 97, 519, 763, 1004};
        assertEquals(_02_BinarySearch.binarySearch(arr2, 0, arr2.length, 97), 9);
        int[] arr3 = {1_209, 1_306, 1_437, 20_653, 94_934, 94_935, 808_012, 1_650_910, 256_923_456};
        assertEquals(_02_BinarySearch.binarySearch(arr3, 0, arr3.length, 94935), 5);
    }
}

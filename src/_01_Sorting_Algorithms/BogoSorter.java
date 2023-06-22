package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }

    Random r = new Random();
    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
        while (!isSorted(array)) {
        	if (isSorted(array)) {
            	return;
            } else {
            	int i1 = r.nextInt(array.length);
            	int e1 = array[i1];
            	int i2 = r.nextInt(array.length);
            	int e2 = array[i2];
            	array[i1] = e2;
            	array[i2] = e1;
            	display.updateDisplay();
            }
        }
    }
    
    boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }
}

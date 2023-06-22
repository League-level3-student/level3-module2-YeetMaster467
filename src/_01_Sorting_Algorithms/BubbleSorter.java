package _01_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
    public BubbleSorter() {
        type = "Bubble";
    }

    /* 
     * Use the bubble sorting algorithm to sort the array.
     * You can use display.updateDisplay() to show the current
     * progress on the graph.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
    	for (int i = 0; i < array.length; i++) {
            
            // This for loop puts one value in the correct position
            for (int k = 0; k < array.length - 1; k++) {
                
                // If the current element is bigger than the next...
                if( array[k] > array[ k+1 ] ) {
                    
                    // Swap elements at k and k+1
                    int temp = array[k];
                    array[k] = array[ k+1 ];
                    array[ k+1 ] = temp;
                    display.updateDisplay();
                }
            }
        }
    }
}

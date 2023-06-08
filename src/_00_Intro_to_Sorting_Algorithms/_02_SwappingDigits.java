package _00_Intro_to_Sorting_Algorithms;

class _02_SwappingDigits {

    // 1. Complete the method so that the first two elements of the array are
    //    swapped.
    public static void swapArrayOfTwo(int[] arr) {
    	int first = arr[0];
    	int second = arr[1];
    	
    	arr[0] = second;
    	arr[1] = first;
    	
    }

    // 2. Complete the method so that it sorts the array using a bubble sort.
    //    Iterate through the array and when you find two elements that are out
    //    of order, swap them. Repeat this until the array is in order.
    public static void sortIntArray(int[] arr) {
    	for (int i = 0; i < arr.length; i++) {
    		for (int j = i + 1; j < arr.length; j++) {
    			if (arr[i] > arr[j]) {
        			int first = arr[i];
        	    	int second = arr[j];
        	    	
        	    	arr[i] = second;
        	    	arr[j] = first;
        	    	
        	    	
        		}
	    	}
    	}
    }

    // 3. Complete the method so that it finds the middle number in the array.
    //    *Hint* it helps to sort it first.
    //    *Double Hint* Use the method you already wrote in step 2 to sort it
    public static int findMiddle(int[] arr) {
    	
    	for (int i = 0; i < arr.length; i++) {
    		for (int j = i + 1; j < arr.length; j++) {
    			if (arr[i] > arr[j]) {
        			int first = arr[i];
        	    	int second = arr[j];
        	    	
        	    	arr[i] = second;
        	    	arr[j] = first;
        	    	
        	    	
        		}
	    	}
    	}
    	
    	if (arr.length % 2 == 1) {
    		return arr[(int) ((arr.length / 2) + 0.5)];
    	} else {
    		return (arr[arr.length / 2] + arr[(arr.length / 2) + 1]) / 2;
    	}
    }
}

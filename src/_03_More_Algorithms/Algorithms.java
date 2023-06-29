package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return num1 + " x " + num2 + " = " + (num1 * num2);
    }
    
    public static int findBrokenEgg(List<String> eggs) {

    	for (int i = 0; i < eggs.size(); i++) {
    		if (eggs.get(i) == "cracked") {
    			return i;
    		}
    	}

        return -1;
    }
    
    public static boolean isPrime(int num) {
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
    	
    	return true;
    }
    
    public static boolean isSquare(int num) {
		
    	for (int i = 1; i <= num; i++) {
			if (num == i*i) {
				return true;
			}
		}
    	
    	return false;
    }
    
    public static boolean isCube(int num) {
    	for (int i = 1; i <= num; i++) {
			if (num == i*i*i) {
				return true;
			}
		}
    	
    	return false;
    }
    
    public static int countPearls(List<Boolean> oysters) {
		int pearls = 0;
    	for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				pearls++;
			}
		}
    	
    	return pearls;
    	
    }
    
    public static double findTallest(List<Double> arr) {
    	double tallest = arr.get(0);
    	
    	for (Double i : arr) {
			if (i > tallest) {
				tallest = i;
			}
		}
    	
    	return tallest;
    	
    }
    
    public static String findLongestWord(List<String> words) {
    	String longest = words.get(0);
    	
    	for (String i : words) {
			if (i.chars().count() < longest.chars().count()) {
				longest = i;
			}
		}
    	
    	return longest;
    }
    
}

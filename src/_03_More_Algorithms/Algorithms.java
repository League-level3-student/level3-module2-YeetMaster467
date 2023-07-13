package _03_More_Algorithms;

import java.util.Collections;
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
			if (i.chars().count() > longest.chars().count()) {
				longest = i;
			}
		}
    	
    	return longest;
    }
    
    public static boolean containsSOS(List<String> message) {
    	for (int i = 0; i < message.size(); i++) {
			if (message.get(i).contains("... --- ...")) {
				return true;
			}
		}
    	return false;
    }
    
    public static List<Double> sortScores(List<Double> scores) {
    	
    	int size = scores.size();
    	quickSort(scores, 0, size - 1);
    	
    	List<Double> results = scores;
    	return results;
    	
    }
    
    public static List<String> sortDNA(List<String> sequences) {
    	
    	for(int i = 0; i < sequences.size(); i++) {
    		for (int j = i + 1; j < sequences.size(); j++) {
    			if (sequences.get(i).length() > sequences.get(j).length()) {
    				String temp = sequences.get(j);
    				sequences.set(j, sequences.get(i));
    				sequences.set(i, temp);
    			}
    		}
    	}
    	
    	return sequences;
    }
    
    public static List<String> sortWords (List<String> words) {
    	for (int i = 0; i < words.size(); i++) {
    		for (int j = i + 1; j < words.size(); j++) {
    			if (words.get(i).compareTo(words.get(j)) > 0) {
    				String temp = words.get(j);
    				words.set(j, words.get(i));
    				words.set(i, temp);
    			}
    		}
    	}
    	
    	return words;
    }
    
    
    private static void quickSort(List<Double> list, int low, int high) {
       
        int i = low;
        int j = high;
       
        
        double pivot = list.get(low + (high - low) / 2); 

        
        while (i <= j) {
            
            while (list.get(i) < pivot) {
                i++;
            }
            
            while (list.get(j) > pivot) {
                j--;
            }
            
            if (i <= j) {
                
            	Collections.swap(list, i, j);
    
                i++;
                j--;
            }
        }
        
        
        if (low < j){
            quickSort(list, low, j);
        }
        
        
        if (i < high){
            quickSort(list, i, high);
        }
    }
}

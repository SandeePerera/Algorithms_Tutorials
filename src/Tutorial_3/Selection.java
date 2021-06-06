/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial_3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Selection {
//   private Selection() { }
//
//    /**
//     * Rearranges the array in ascending order, using the natural order.
//     * @param a the array to be sorted
//     */
//    public static void sort(Comparable[] a) {
//        int n = a.length;
//        for (int i = 0; i < n; i++) {
//            int min = i;
//            for (int j = i+1; j < n; j++) {
//                if (less(a[j], a[min])) min = j;
//            }
//            exch(a, i, min);
//            assert isSorted(a, 0, i);
//        }
//        assert isSorted(a);
//    }
//
//    /**
//     * Rearranges the array in ascending order, using a comparator.
//     * @param a the array
//     * @param comparator the comparator specifying the order
//     */
//    public static void sort(Object[] a, Comparator comparator) {
//        int n = a.length;
//        for (int i = 0; i < n; i++) {
//            int min = i;
//            for (int j = i+1; j < n; j++) {
//                if (less(comparator, a[j], a[min])) min = j;
//            }
//            exch(a, i, min);
//            assert isSorted(a, comparator, 0, i);
//        }
//        assert isSorted(a, comparator);
//    }
//
//
//   /***************************************************************************
//    *  Helper sorting functions.
//    ***************************************************************************/
//    
//    // is v < w ?
//    private static boolean less(Comparable v, Comparable w) {
//        return v.compareTo(w) < 0;
//    }
//
//    // is v < w ?
//    private static boolean less(Comparator comparator, Object v, Object w) {
//        return comparator.compare(v, w) < 0;
//    }
//        
//        
//    // exchange a[i] and a[j]
//    private static void exch(Object[] a, int i, int j) {
//        Object swap = a[i];
//        a[i] = a[j];
//        a[j] = swap;
//    }
//
//
//   /***************************************************************************
//    *  Check if array is sorted - useful for debugging.
//    ***************************************************************************/
//
//    // is the array a[] sorted?
//    private static boolean isSorted(Comparable[] a) {
//        return isSorted(a, 0, a.length - 1);
//    }
//        
//    // is the array sorted from a[lo] to a[hi]
//    private static boolean isSorted(Comparable[] a, int lo, int hi) {
//        for (int i = lo + 1; i <= hi; i++)
//            if (less(a[i], a[i-1])) return false;
//        return true;
//    }
//
//    // is the array a[] sorted?
//    private static boolean isSorted(Object[] a, Comparator comparator) {
//        return isSorted(a, comparator, 0, a.length - 1);
//    }
//
//    // is the array sorted from a[lo] to a[hi]
//    private static boolean isSorted(Object[] a, Comparator comparator, int lo, int hi) {
//        for (int i = lo + 1; i <= hi; i++)
//            if (less(comparator, a[i], a[i-1])) return false;
//        return true;
//    }
//
//
//
//    // print array to standard output
//    private static void show(Comparable[] a) {
//        for (int i = 0; i < a.length; i++) {
//            StdOut.println(a[i]);
//        }
//    }
//
//    /**
//     * Reads in a sequence of strings from standard input; selection sorts them; 
//     * and prints them to standard output in ascending order. 
//     *
//     * @param args the command-line arguments
//     */
//    public static void main(String[] args) {
//    	
//    	// ONLY for IDE version, remove otherwise
//    	Scanner input = null;
//		try {
//			input = new Scanner(new File("words3.txt"));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		// END of IDE version
//		
//		int N = input.nextInt();
//		String[] a = new String[N];
//		
//		// ONLY for IDE version, remove otherwise
//		int i = 0;
//		while (input.hasNext()) {
//			a[i] = input.next();
//			i++;
//		}
//                
//		
//		// END of IDE version
//		
//		// Enable line below for the console/terminal version....
//        // String[] a = StdIn.readAllStrings();
//	    Selection.sort(a);
//        show(a);
//    }
}

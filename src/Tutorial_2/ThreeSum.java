package Tutorial_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ThreeSum {

    /**
     * Prints to standard output the (i, j, k) with i < j < k such that a[i] + a[j] + a[k] == 0.
     * @param a the array of integers
     */

    public static void printAll(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                    }
                }
            }
        }
    }

    /**
     * Returns the number of triples (i, j, k) with i < j < k such that a[i] + a[j] + a[k] == 0.
     * @param a the array of integers
     * @return the number of triples (i, j, k) with i < j < k such that a[i] + a[j] + a[k] == 0
     */

    public static int count(int[] a) {

        int N = a.length;
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int[] readAllInts(Scanner s){
        ArrayList<Integer> intList = new ArrayList<>();
        while(s.hasNextInt())
            intList.add(s.nextInt());
        int numInts = intList.size();
        int[] a = new int[numInts];
        for(int i=0; i<numInts; i++)
            a[i] = intList.get(i);
        return a;
    }

    /**
     * Reads in a sequence of integers from a file, specified as a command-line argument;
     * counts the number of triples sum to exactly zero; prints out the time to perform
     * the computation.
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = null;
        input = new Scanner(new File("2Kints.txt"));
        int[] a = readAllInts(input);

        long start = System.currentTimeMillis();
        int cnt = count(a);
        long now = System.currentTimeMillis();
        double elapsed = (now - start) / 1000.0;
        System.out.println(cnt);
        System.out.println();
        System.out.println("Elapsed time = " + elapsed + " seconds");
    }
}

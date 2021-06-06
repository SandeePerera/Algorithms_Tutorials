/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial_2;

/**
 *
 * @author User
 */
public class CheckRun {
    
    
public static int count(int[] a){

    int N = a.length;
    int count = 0;
    
    for (int i = 0; i < N; i++)
    for (int j = i+1; j < N; j++)
    for (int k = j+1; k < N; k++)

        if (a[i] + a[j] + a[k] == 0)
        count++;
   
    return count;
    
    }
}


    


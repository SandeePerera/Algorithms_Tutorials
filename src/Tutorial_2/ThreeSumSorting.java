package Tutorial_2;

import static java.util.Arrays.sort;

public class ThreeSumSorting {

    public static int count(int[] a){
             
    sort(a);

    int N = a.length;
    int count = 0;

        for (int i = 0; i < N; i++)
        for (int j = i+1; j < N; j++)
           // if(binarySearch (a, -a[i]-a[j]))
      
        count++;
    
    
        return count;

    }
}
 

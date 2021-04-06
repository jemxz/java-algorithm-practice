/*
11. An array is called zero-balanced if its elements sum to 0 and for each positive
element n, there exists another element that is the negative of n. Write a function named
isZeroBalanced that returns 1 if its argument is a zero-balanced array. Otherwise it
returns 0.
*/

public class ZeroBalanced {
  public static void main(String[] args){
    int[] x = {};
    System.out.println(f(x));
  }

  public static int f(int[] a){
    // take care of special cases
    if(a.length==0)
      return 0;

    for(int i=0; i<a.length; i++){
      int target = a[i];
      int positiveCount = 0;
      int negativeCount = 0;
      // calculate positiveCount and negativeCount
      for(int j=0; j<a.length; j++){
        if(a[j]==target)
          positiveCount++;
        if(a[j]==-target)
          negativeCount++;
      }

      if(negativeCount!=positiveCount)
        return 0;
    }
    return 1;
  }
}

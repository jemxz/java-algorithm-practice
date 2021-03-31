/*
1. Write a function named minDistance that returns the smallest distance between two factors of a
number. For example, consider 13013 = 1*7*11*13. Its factors are 1, 7, 11, 13 and 13013.
minDistance(13013) would return 2 because the smallest distance between any two factors is 2 (13 -
11 = 2). As another example, minDistance (8) would return 1 because the factors of 8 are 1, 2, 4, 8
and the smallest distance between any two factors is 1 (2 – 1 = 1).
*/

public class MinDistance {
  public static void main(String[] args){
    System.out.println(f(8));
  }

  public static int f(int x){
    int previousFactor = 1;
    int leastDiff = x-1;
    for(int i=2; i<x; i++){
      if(x%i!=0)
        continue;
      if(i-previousFactor<leastDiff)
        leastDiff = i-previousFactor;
      previousFactor=i;
    }
    return leastDiff;
  }
}

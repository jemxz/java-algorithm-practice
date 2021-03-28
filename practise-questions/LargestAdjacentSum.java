/*
1. Write a function named largestAdjacentSum that iterates through an array computing the sum of
adjacent elements and returning the largest such sum. You may assume that the array has at least 2
elements.
*/

public class LargestAdjacentSum {
  public static void main(String[] args){
    int[] x = {1,1,1,1,1,2,1,1,1};
    System.out.println(f(x));
  }

  public static int f(int[] a){
    int temp = a[0]+a[1];
    for(int i=1; i<a.length; i++){
      if(temp<a[i]+a[i-1])
        temp = a[i]+a[i-1];
    }
    return temp;
  }
}

/*
7. An array is said to be hollow if it contains 3 or more zeros in the middle that are
preceded and followed by the same number of non-zero elements. Furthermore, all the
zeroes in the array must be in the middle of the array. Write a function named isHollow
that accepts an integer array and returns 1 if it is a hollow array, otherwise it returns 0.
*/

public class Hollow {
  public static void main(String[] args){
    int[] x = {0,0,0};
    System.out.println(f(x));
  }

  public static int f(int[] a){
    int zeroCount = 0;
    int length = a.length;
    for(int i=0; i<length; i++)
      if(a[i]==0)
        zeroCount++;

    if((length-zeroCount)%2==1 || zeroCount<3)
      return 0;
    for(int i=0; i<(length-zeroCount)/2; i++)
      if(a[i]*a[length-i-1]==0)
        return 0;

    return 1;
  }
}

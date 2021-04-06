/*
4. A non-empty array a of length n is called an array of all possiblities if it contains
all numbers between 0 and a.length-1 inclusive. Write a method named isAllPossibilities
that accepts an integer array and returns 1 if the array is an array of all possiblities,
otherwise it returns 0.
*/

public class AllPossibilities {
  public static void main(String[] args){
    int[] x = {};
    System.out.println(f(x));
  }

  public static int f(int[] a){
    if(a.length == 0)
      return 0;
    for(int i=0; i<a.length; i++){
      for(int j=0;j<a.length;j++){
        if(a[j] == i)
          break;
        else if(j==a.length-1)
          return 0;
      }
    }
    return 1;
  }
}

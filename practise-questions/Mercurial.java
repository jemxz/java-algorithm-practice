/*
2. Define an array to be a Mercurial array if a 3 does not occur between any two 1s.
Write a function named isMercurial that returns 1 if its array argument is a Mercurial
array, otherwise it returns 0.
*/

public class Mercurial {
  public static void main(String[] args){
    int[] x = {};
    System.out.println(f(x));
  }

  public static int f(int[] a){
    int last = 0;
    int first = 0;
    for(int i=0; i<a.length; i++)
      if(a[i]==1){
        first = i;
        break;
      }
    for(int i=a.length-1; i>=0; i--)
      if(a[i]==1){
        last = i;
        break;
      }

    for(int i=first; i<last; i++)
      if(a[i]==3)
        return 0;
    return 1;
  }
}

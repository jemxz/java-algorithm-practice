/*
Consider a simple pattern matching language that matches arrays of integers. A pattern is an array of
integers. An array matches a pattern if it contains sequences of the pattern elements in the same order as
they appear in the pattern. So for example, the array {1, 1, 1, 2, 2, 1, 1, 3} matches the pattern {1, 2, 1, 3}
as follows:
{1, 1, 1, 2, 2, 1, 1, 3} {1, 2, 1, 3} (first 1 of pattern matches three 1s in array)
{1, 1, 1, 2, 2, 1, 1, 3} {1, 2, 1, 3} (next element of pattern matches two 2s in array)
{1, 1, 1, 2, 2, 1, 1, 3} {1, 2, 1, 3} (next element of pattern matches two 1s in array)
{1, 1, 1, 2, 2, 1, 1, 3} {1, 2, 1, 3} (last element of pattern matches one 3 in array)
The pattern must be completely matched, i.e. the last element of the array must be matched by the last
element of the pattern.
*/
public class MatchPattern {
  public static void main(String[] args){
    int[] a = {1, 1, 10, 4, 4, 3};
    int[] p = {1,10,4,3};
    System.out.println(f(a,p));
  }

  public static int f(int[] a, int[] p){
    int counter= 0;
    if(a[0] != p[0])
      return 0;
    for(int i=1; i<a.length; i++){
      if(a[i] != a[i-1]){
        counter++;
        if(counter >= p.length || a[i] != p[counter])
          return 0;
      }
    }
    if(counter == p.length-1)
      return 1;
    return 0;
  }
}

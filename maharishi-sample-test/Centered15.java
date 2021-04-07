/*
3. An array is called centered-15 if some consecutive sequence of elements of the array sum to
15 and this sequence is preceded and followed by the same number of elements. For example
{3, 2, 10, 4, 1, 6, 9} is centered-15 because the sequence 10, 4, 1 sums to 15 and the sequence is
preceded by two elements (3, 2) and followed by two elements(6,9).
*/

public class Centered15 {
  public static void main(String[] args){
    System.out.println(f(new int[] {3, 2, 10, 4, 1, 6, 9}));
    System.out.println(f(new int[] {2, 10, 4, 1, 6, 9}));
    System.out.println(f(new int[] {3, 2, 10, 4, 1, 6}));
    System.out.println(f(new int[] {1,1,8, 3, 1, 1}));
    System.out.println(f(new int[] {9, 15, 6}));
    System.out.println(f(new int[] {1, 1, 2, 2, 1, 1}));
    System.out.println(f(new int[] {1,1,15,-1,-1}));
  }


  public static int f(int[] a) {
    int start = a.length/2;
    int end = start;
    if(a.length%2==0)
      start -= 1;

    while(end<a.length){
      int sum = 0;
      for(int i=start;i<=end;i++)
        sum += a[i];
      if(sum==15)
        return 1;
      end++;
      start--;
    }

    return 0;
  }

}

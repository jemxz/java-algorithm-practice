/*
3. Define an m-n sequenced array to be an array that contains one or more occurrences of all the integers
between m and n inclusive. Furthermore, the array must be in ascending order and contain only those
integers. For example, {2, 2, 3, 4, 4, 4, 5} is a 2-5 sequenced array. The array {2, 2, 3, 5, 5, 5} is not a 2-5
sequenced array because it is missing a 4. The array {0, 2, 2, 3, 3} is not a 2-3 sequenced array because the
0 is out of range. And {1,1, 3, 2, 2, 4} is not a 1-4 sequenced array because it is not in ascending order.
Write a method named isSequencedArray that returns 1 if its argument is a m-n sequenced array,
otherwise it returns 0.
*/

public class SequenceArray {
  public static void main(String[] args){
    int[] a = {-5, -5, -4, -4, -4, -3, -3, -2, -2, -2};
    System.out.println(f(a,-5,-2));
  }

  public static int f(int[] a, int m, int n){
    if(a[0] != m || a[a.length-1] != n)
      return 0;

    for(int i=1; i<a.length; i++){
      if((a[i]-a[i-1] != 0) && (a[i]-a[i-1])!=1)
        return 0;
    }
    return 1;
  }
}

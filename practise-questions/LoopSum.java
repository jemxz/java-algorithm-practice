/*

*/

public class LoopSum {
  public static void main(String[] args){
    int[] x = {1, 4, 5, 6};
    System.out.println(f(x,4));
  }

  public static int f(int[] a, int n){
    int i = 0;
    int sum = 0;
    while(i<n){
      sum += a[i%a.length];
      i++;
    }
    return sum;
  }
}

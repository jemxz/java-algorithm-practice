/*

*/

public class PairwiseSum {
  public static void main(String[] args){
    int[] x = {2,1,18,-5};
    System.out.println(f(x));
  }

  public static int[] f(int[] a){
    int[] b = int[(int)(a.length/2)];
    for(int i=0; i<a.length/2; i++){
      i *= 2;
      b[i] = a[i]+a[i+1];
    }
    return b;
  }
}

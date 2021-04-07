/*
2. A Madhav array has the following property.
a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] = ...
The length of a Madhav array must be n*(n+1)/2 for some n.
*/

public class Madhav {
  public static void main(String[] args){
    System.out.println(f(new int[] {2, 1, 1, 4, -1, -1}));
    System.out.println(f(new int[] {2, 1, 1}));
    System.out.println(f(new int[] {6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
    System.out.println(f(new int[] {18, 9, 10, 6, 6, 6}));
    System.out.println(f(new int[] {-6, -3, -3, 8, -5, -4}));
    System.out.println(f(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}));
    System.out.println(f(new int[] {3, 1, 2, 3, 0}));


  }


  public static int f(int[] a) {
    // Check that length equals n*(n+1)/2
    int size = 0;
    for(int i=0; i*(i+1)<=2*a.length; i++)
      if(i*(i+1) == 2*a.length){
        size = i;
      }
    if(size == 0)
      return 0;

    int base = a[0];
    for(int i=1; i<size;i++){
      int now = i*(i+1)/2;
      int next = (i+1)*(i+2)/2;
      int sum = 0;
      for(int k=now; k<next; k++)
        sum += a[k];
      if(sum != base)
        return 0;
    }

    return 1;
  }

}

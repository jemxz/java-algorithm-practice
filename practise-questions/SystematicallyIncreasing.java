/*
Check if an array is systematically increasing

{1}
{1, 1, 2}
{1, 1, 2, 1, 2, 3}
{1, 1, 2, 1, 2, 3, 1, 2, 3, 4}
{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5}
{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6}

*/

public class SystematicallyIncreasing {
  public static void main(String[] args){
    int[] x = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4};
    System.out.println(f(x));
  }

  public static int f(int[] a){
    int max = a[a.length-1];
    int length = max*(max-1);
    int c = 0;
    if(2*a.length!=max*(max+1))
      return 2;
    for(int i=0; i<max; i++){
      for(int j=0; j<=i;j++,c++)
        if(a[c]!=j+1)
          return 0;
    }
    return 1;
  }
}

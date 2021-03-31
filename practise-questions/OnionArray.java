/*
1. An onion array is an array that satisfies the following condition for all values of j and k:
if j>=0 and k>=0 and j+k=length of array and j!=k then a[j]+a[k] <= 10
*/

public class OnionArray {
  public static void main(String[] args){
    int[] x = {1, 2, 19, 4, 5};
    System.out.println(f(x));
  }

  public static int f(int[] a){
    if(a.length == 0)
      return 1;
    for(int i=0; i<(a.length/2)+1;i++){
      if(2*i == a.length-1)
        continue;
      if(a[i]+a[a.length-i-1]>10)
        return 0;
    }
    return 1;
  }
}

/*
5. An array is called layered if its elements are in ascending order and each element
appears two or more times. For example, {1, 1, 2, 2, 2, 3, 3} is layered but {1, 2, 2, 2, 3,
3} and {3, 3, 1, 1, 1, 2, 2} are not. Write a method named isLayered that accepts an
integer array and returns 1 if the array is layered, otherwise it returns 0.
*/

public class Layered {
  public static void main(String[] args){
    int[] x = {};
    System.out.println(f(x));
  }

  public static int f(int[] a){
    if(a.length<=1 || a[0]!=a[1] || a[a.length-1]!=a[a.length-2])
      return 0;
    for(int i=1; i<a.length-1; i++){
      if(a[i]!=a[i+1] && a[i]!=a[i-1])
        return 0;
      if(a[i]>a[i+1])
        return 0;
    }
    return 1;
  }
}

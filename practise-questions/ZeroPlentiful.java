/*
1. An array is zero-plentiful if it contains at least one 0 and every sequence of 0s is of length at least 4.
Write a method named isZeroPlentiful which returns the number of zero sequences if its array argument is
zero-plentiful, otherwise it returns 0.
*/

public class ZeroPlentiful {
  public static void main(String[] args){
    int[] x = {0, 0, 0, 0, 0, 1, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0};
    System.out.println(f(x));
  }

  public static int f(int[] a){
    int fourzeros = 0;
    int tempzeros = 0;
    int counter = 0;
    for(int i=0; i<a.length-4; i++){
      tempzeros = 0;
      counter = i;
      while(true){
        if(counter<a.length && a[counter]==0){
          tempzeros++;
          counter++;
        }
        else
          break;
      }
      if(tempzeros>=4){
        i += tempzeros;
        fourzeros++;
      }
    }
    return fourzeros;
  }
}

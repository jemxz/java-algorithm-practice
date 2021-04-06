/*
IMPLEMENT A MILEAGE COUNTER
*/
import java.util.Arrays;
public class UpdateMileage {
  public static void main(String[] args){
    int[] x = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
    f(x,13);
    System.out.println(Arrays.toString(x));
  }

  public static void f(int[] a, int m){
    for(int i=0; i<m; i++)
      up(a);
  }

  public static void up(int[] a){
    int lessThanNine = a.length;
    for(int i=0; i<a.length; i++)
      if(a[i]<9){
        lessThanNine = i;
        break;
      }
    if(lessThanNine==a.length)
      for(int i=0; i<a.length; i++){
        a[i] = 0;
      }
    else{
      for(int i=0; i<lessThanNine; i++)
        a[i] = 0;
      a[lessThanNine] = a[lessThanNine]+1;
    }

  }
}
